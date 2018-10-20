package com.laibao.micronaut.iocapp.qualify.byannotation;

import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Singleton;

@Singleton
@V8
public class V8Engine implements Engine {

    @Override
    public int getCylinders() {
        return 8;
    }

    @Override
    public String start() {
        return "Starting @V8 Engine";
    }
}
