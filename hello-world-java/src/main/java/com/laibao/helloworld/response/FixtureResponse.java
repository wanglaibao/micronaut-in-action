package com.laibao.helloworld.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FixtureResponse {
    private final String homeClub;
    private final String awayClub;

    private final Integer homeScore;
    private final Integer awayScore;

    private final String stadium;
}
