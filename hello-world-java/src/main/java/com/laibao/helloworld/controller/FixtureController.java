package com.laibao.helloworld.controller;

import com.laibao.helloworld.domain.Fixture;
import com.laibao.helloworld.response.FixtureResponse;
import com.laibao.helloworld.service.FixtureService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

import java.util.List;

@Controller("/fixture")
public class FixtureController {

    private final FixtureService fixtureService;

    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @Get("/list")
    public List<Fixture> list() {
        return fixtureService.findAll();
    }
}
