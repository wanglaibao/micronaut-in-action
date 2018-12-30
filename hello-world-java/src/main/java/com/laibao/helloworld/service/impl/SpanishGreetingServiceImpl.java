package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.service.GreetingService;

import javax.inject.Singleton;

@Singleton
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola ";
    }
}
