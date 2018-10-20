package com.laibao.micronaut.iocapp;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Car {

    /**
     *  Field injection
     */
    @Inject
    private Engine engine;

    public String start() {
        return "the car's " + engine.start();
    }
}
