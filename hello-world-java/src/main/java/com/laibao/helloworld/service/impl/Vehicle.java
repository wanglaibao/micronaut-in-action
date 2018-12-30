package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.service.Engine;

import javax.inject.Singleton;

@Singleton
public class Vehicle {

    final Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
