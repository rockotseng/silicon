#FROM java:8
FROM frolvlad/alpine-oraclejdk8:slim
#FROM anapsix/alpine-java:8
VOLUME /tmp
ADD silicon.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]