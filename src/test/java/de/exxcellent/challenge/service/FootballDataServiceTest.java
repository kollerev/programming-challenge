package de.exxcellent.challenge.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballDataServiceTest {

    @Test
    void getTeamNameOfSmallestGoalsDistance() {
        assertEquals("Aston_Villa", FootballDataService.getTeamNameOfSmallestGoalsDistance(), "Team name is not correct");
    }
}
