package com.laibao.helloworld.service.impl;

import com.laibao.helloworld.domain.Fixture;
import com.laibao.helloworld.repository.FixtureRepository;
import com.laibao.helloworld.response.FixtureResponse;
import com.laibao.helloworld.service.FixtureService;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class FixtureServiceImpl implements FixtureService {

    private final FixtureRepository fixtureRepository;

    public FixtureServiceImpl(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    public List<Fixture> findAll() {
        return fixtureRepository.findAll();
    }
}
