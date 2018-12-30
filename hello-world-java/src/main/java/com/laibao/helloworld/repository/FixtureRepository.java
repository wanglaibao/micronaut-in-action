package com.laibao.helloworld.repository;

import com.laibao.helloworld.domain.Fixture;

import java.util.List;

public interface FixtureRepository {
    List<Fixture> findAll();
}
