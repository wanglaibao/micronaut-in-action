package com.laibao.micronaut.helloapp.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.sse.Event;
import io.reactivex.Flowable;
import io.reactivex.Single;
import org.reactivestreams.Publisher;

import java.util.concurrent.TimeUnit;

/**
 * Micronaut supports reactive streams out-of-the-box, so there’s not much thinking to be done.
 */
@Controller("/reactiveHello")
public class ReactiveHelloController {

    @Get("/{name}")
    public Single<String> hello(String name) {
        return Single.just("Hello " + name);
    }

    @Get("/count")
    public Publisher<Event<Integer>> count() {
        return Flowable.just(1,2,3,4,5,6,7,8,9,10)
                        .zipWith(Flowable.interval(500, TimeUnit.MILLISECONDS), (item, interval) -> Event.of(item))
                        .doOnComplete(() -> {});
    }
}
