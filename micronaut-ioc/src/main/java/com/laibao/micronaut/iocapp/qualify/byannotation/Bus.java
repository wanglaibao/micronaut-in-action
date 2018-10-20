package com.laibao.micronaut.iocapp.qualify.byannotation;


import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Bus {

    private com.laibao.micronaut.iocapp.qualify.byname.Engine engine;

    @Inject
    public void setEngine(@V8 Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
