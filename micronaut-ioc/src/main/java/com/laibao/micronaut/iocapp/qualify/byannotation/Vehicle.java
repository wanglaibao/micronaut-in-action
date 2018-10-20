package com.laibao.micronaut.iocapp.qualify.byannotation;

import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Vehicle {

    final com.laibao.micronaut.iocapp.qualify.byname.Engine engine;

    @Inject
    public Vehicle(@V6  Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
