package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.service.Engine;

import javax.inject.Singleton;

@Singleton
public class V8EngineImpl implements Engine {
    int cylinders = 8;

    @Override
    public int getCylinders() {
        return this.cylinders;
    }

    public String start() {
        return "Starting V8";
    }
}
