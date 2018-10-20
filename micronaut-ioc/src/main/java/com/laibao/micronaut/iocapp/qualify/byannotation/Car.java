package com.laibao.micronaut.iocapp.qualify.byannotation;

import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Car {

    /**
     *  Field injection
     */
    @Inject
    @V7
    private Engine engine;

    public String start() {
        return engine.start();
    }
}
