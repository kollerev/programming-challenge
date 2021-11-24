package de.exxcellent.challenge.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataServiceTest {

    @Test
    void getSmallestWeatherDifference() {
        assertEquals(14, WeatherDataService.getDayOfSmallestTemperatureSpread());
    }
}
