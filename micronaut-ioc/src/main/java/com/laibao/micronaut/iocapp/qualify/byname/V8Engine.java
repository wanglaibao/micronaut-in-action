package com.laibao.micronaut.iocapp.qualify.byname;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("V8Engine")
public class V8Engine implements Engine{

    @Override
    public int getCylinders() {
        return 8;
    }

    @Override
    public String start() {
        return "Starting V8 Engine";
    }
}
