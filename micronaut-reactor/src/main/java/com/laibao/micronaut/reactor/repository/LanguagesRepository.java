package com.laibao.micronaut.reactor.repository;

import com.laibao.micronaut.reactor.domain.Language;

import java.util.List;

public interface LanguagesRepository {
    public List<Language> findAll();

    public Language findByName(String name);
}
