package com.laibao.micronaut.iocapp.qualify.byname;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("V7Engine")
public class V7Engine implements Engine{

    @Override
    public int getCylinders() {
        return 7;
    }

    @Override
    public String start() {
        return "Starting V7 Engine";
    }
}
