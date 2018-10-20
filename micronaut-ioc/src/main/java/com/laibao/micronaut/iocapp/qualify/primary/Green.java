package com.laibao.micronaut.iocapp.qualify.primary;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Singleton
@Primary
public class Green implements Color {

    @Override
    public String getColor() {
        return "green";
    }

}
