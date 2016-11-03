package com.rga.silicon;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.sleuth.Span;
// import org.springframework.cloud.sleuth.SpanExtractor;
// import org.springframework.cloud.sleuth.SpanInjector;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Primary;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    // @Bean
    // @Primary
    // public SpanExtractor<HttpServletRequest> customHttpServletRequestSpanExtractor() {
    // return new CustomHttpServletRequestSpanExtractor();
    // }
    //
    // @Bean
    // @Primary
    // public SpanInjector<HttpServletResponse> customHttpServletResponseSpanInjector() {
    // return new CustomHttpServletResponseSpanInjector();
    // }
    //
    // static class CustomHttpServletRequestSpanExtractor implements
    // SpanExtractor<HttpServletRequest> {
    //
    // @Override
    // public Span joinTrace(HttpServletRequest carrier) {
    // long traceId = Span.hexToId(carrier.getHeader("traceId"));
    // long spanId = Span.hexToId(carrier.getHeader("spanId"));
    // // extract all necessary headers
    // Span.SpanBuilder builder = Span.builder().traceId(traceId).spanId(spanId);
    // // build rest of the Span
    // return builder.build();
    // }
    // }
    //
    // static class CustomHttpServletResponseSpanInjector implements
    // SpanInjector<HttpServletResponse> {
    //
    // @Override
    // public void inject(Span span, HttpServletResponse carrier) {
    // carrier.addHeader("Trace-Id", Span.idToHex(span.getTraceId()));
    // carrier.addHeader("Span-Id", Span.idToHex(span.getSpanId()));
    // // inject the rest of Span values to the header
    // }
    // }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
