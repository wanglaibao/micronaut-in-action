package com.laibao.micronaut.reactor.controller;

import com.laibao.micronaut.reactor.domain.Language;
import com.laibao.micronaut.reactor.repository.LanguagesRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.Callable;

@Controller("/language")
public class LanguagesController {

    private final LanguagesRepository repository;

    public LanguagesController(final LanguagesRepository repository) {
        this.repository = repository;
    }

    @Get("/{name}")
    public Mono<Language> findByName(final String name) {
        return blockingGet(() -> repository.findByName(name));
    }

    @Get("/")
    public Flux<Language> findAll() {
        return blockingGet(() -> repository.findAll()).flatMapMany(Flux::fromIterable);
    }

    private <T> Mono<T> blockingGet(final Callable<T> callable) {
        return Mono.fromCallable(callable)
                .subscribeOn(Schedulers.elastic());
    }

}
