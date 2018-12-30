package com.laibao.helloworld.controller;

import com.laibao.helloworld.service.GreetingService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import reactor.core.publisher.Mono;

import javax.inject.Inject;

@Controller("/async/greet")
public class AsyncGreetController {

    @Inject
    private GreetingService greetingService;

    @Get("/{name}")
    public Single<String> greetByRxJava2(String name) {
        return Single.just(greetingService.getGreeting() + name + " from RxJava2");
    }

    @Get("/{name}/{reactiveType}")
    public Mono<String> greetByReactor(String name,String reactiveType) {
        return Mono.just(greetingService.getGreeting() + name+" from reactiveType "+ reactiveType);
    }
}
