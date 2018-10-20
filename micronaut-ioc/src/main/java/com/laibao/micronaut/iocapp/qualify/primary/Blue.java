package com.laibao.micronaut.iocapp.qualify.primary;

import javax.inject.Singleton;

@Singleton
public class Blue implements Color {

    @Override
    public String getColor() {
        return "blue";
    }

}
