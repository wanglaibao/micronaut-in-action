package com.laibao.micronaut.iocapp;

import javax.inject.Singleton;

@Singleton
public class Vehicle {

    private final Engine engine;
    /**
     * The Engine is injected via constructor injection
     */
    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
