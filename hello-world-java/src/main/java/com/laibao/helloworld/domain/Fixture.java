package com.laibao.helloworld.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Fixture {
    private final Long homeClubId;
    private final Long awayClubId;

    private final Integer homeScore;
    private final Integer awayScore;
}
