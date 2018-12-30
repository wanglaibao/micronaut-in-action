package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.service.GreetingService;

import javax.inject.Singleton;

@Singleton
public class EnglishGreetingServiceIpml implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello in English Greeting";
    }
}
