#! Groovy

node {

    properties([
        pipelineTriggers([
          [$class: "GitHubPushTrigger"]
        ])
    ])

    stage("Checkout") {
        checkout scm
    }

    stage("Build And Test") {

	def MAVEN_HOME = "/home/centos/opt/maven"

        try {

            echo "Build And Test ${env.BRANCH_NAME}" 
            sh "${MAVEN_HOME}/bin/mvn clean test pmd:check"
            currentBuild.result = "SUCCESS"

        } catch (err) {
            currentBuild.result = "FAILURE"
        }
    }
}
