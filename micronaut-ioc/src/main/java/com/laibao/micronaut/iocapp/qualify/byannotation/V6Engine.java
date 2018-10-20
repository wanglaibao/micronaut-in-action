package com.laibao.micronaut.iocapp.qualify.byannotation;

import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Singleton;

@Singleton
@V6
public class V6Engine implements Engine {

    @Override
    public int getCylinders() {
        return 6;
    }

    @Override
    public String start() {
        return "Starting @V6 Engine";
    }
}
