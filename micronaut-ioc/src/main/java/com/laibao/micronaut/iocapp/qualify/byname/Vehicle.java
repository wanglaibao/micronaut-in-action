package com.laibao.micronaut.iocapp.qualify.byname;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class Vehicle {

    final Engine engine;

    @Inject
    public Vehicle(@Named("V6Engine")Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
