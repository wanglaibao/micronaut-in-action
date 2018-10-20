package com.laibao.micronaut.iocapp.qualify.byname;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class Car {

    /**
     *  Field injection
     */
    @Inject
    @Named("V7Engine")
    private Engine engine;

    public String start() {
        return engine.start();
    }
}
