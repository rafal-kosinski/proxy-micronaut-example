package com.example.examples;

import io.micronaut.retry.annotation.Retryable;

public class RetryCreatedByFactoryExample {
    @Retryable
    public void retryMe() {
        System.out.println("Executing retryMe");
        throw new RuntimeException("Simulated error");
    }
}
