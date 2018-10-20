package com.laibao.micronaut.iocapp.qualify.byname;

import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@Singleton
@Named("V6Engine")
public class V6Engine implements Engine{

    @Override
    public int getCylinders() {
        return 6;
    }

    @Override
    public String start() {
        return "Starting V6 Engine";
    }
}
