package com.laibao.micronaut.iocapp.qualify.byannotation;

import com.laibao.micronaut.iocapp.qualify.byname.Engine;

import javax.inject.Singleton;

@Singleton
@V7
public class V7Engine implements Engine {

    @Override
    public int getCylinders() {
        return 7;
    }

    @Override
    public String start() {
        return "Starting @V7 Engine";
    }
}
