package com.laibao.micronaut.iocapp.qualify.byname;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class Bus {

    private Engine engine;

    @Inject
    public void setEngine(@Named("V8Engine") Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
