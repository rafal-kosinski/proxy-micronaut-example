package com.example.examples;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import jakarta.inject.Singleton;

@Singleton
public class RetryExecutor {
    private final RetryCreatedByFactoryExample retryCreatedByFactoryExample;
    private final RetrySingletonExample retrySingletonExample;

    public RetryExecutor(
        RetryCreatedByFactoryExample retryCreatedByFactoryExample,
        RetrySingletonExample retrySingletonExample
    ) {
        this.retryCreatedByFactoryExample = retryCreatedByFactoryExample;
        this.retrySingletonExample = retrySingletonExample;
    }

    @EventListener
    void executeRetryExample(ServerStartupEvent event) {
        try {
            System.out.println("Executing retryMe in a class created using @Singletion");
            retrySingletonExample.retryMe();
        } catch (Exception ex) {
            System.out.println("Done");
        }
    }

    @EventListener
    void executeRetryExampleFactoryBean(ServerStartupEvent event) {
        try {
            System.out.println("Executing retryMe in class created by factory");
            retryCreatedByFactoryExample.retryMe();
        } catch (Exception ex) {
            System.out.println("Done");
        }
    }
}
