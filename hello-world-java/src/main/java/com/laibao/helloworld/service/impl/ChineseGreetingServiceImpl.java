package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.service.GreetingService;
import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class ChineseGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "你好啊，欢迎来中国玩";
    }
}
