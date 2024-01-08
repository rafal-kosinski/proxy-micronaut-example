package com.example.examples;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

@Factory
public class RetryFactory {
    @Bean
    RetryCreatedByFactoryExample retryCreatedByFactoryExample() {
        return new RetryCreatedByFactoryExample();
    }
}
