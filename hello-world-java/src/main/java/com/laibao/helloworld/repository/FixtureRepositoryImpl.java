package com.laibao.helloworld.repository;

import com.laibao.helloworld.domain.Fixture;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;

@Singleton
public class FixtureRepositoryImpl implements FixtureRepository {

    private List<Fixture> database = Arrays.asList(
            new Fixture(1L, 2L, 5, 0),
            new Fixture(3L, 4L, 3, 1)
    );

    @Override
    public List<Fixture> findAll() {
        return database;
    }
}
