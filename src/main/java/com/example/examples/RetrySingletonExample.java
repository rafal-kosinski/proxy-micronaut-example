package com.example.examples;

import io.micronaut.retry.annotation.Retryable;
import jakarta.inject.Singleton;

@Singleton
public class RetrySingletonExample {

    @Retryable
    public void retryMe() {
        System.out.println("Executing retryMe");
        throw new RuntimeException("Simulated error");
    }
}
