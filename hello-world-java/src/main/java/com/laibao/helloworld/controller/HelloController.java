package com.laibao.helloworld.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

import javax.validation.constraints.NotBlank;

/**
 * @author laibao wang
 * @date 2018-10-17
 * @version 1.0
 */

@Controller("/hello")
@Validated
public class HelloController {

    @Get("/{name}")
    public Single<String> hello(@NotBlank String name) {
        return Single.just("Hello " + name + "!");
    }
}
