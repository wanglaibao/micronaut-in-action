package com.laibao.micronaut.iocapp;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Bus {

    private Engine engine;

    @Inject
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return "the bus's " + engine.start();
    }
}
