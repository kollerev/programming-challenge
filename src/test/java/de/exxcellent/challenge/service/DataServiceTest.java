package de.exxcellent.challenge.service;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.parser.CSVParser;
import de.exxcellent.challenge.service.DataService;
import de.exxcellent.challenge.storage.DataStorage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataServiceTest {

    @Test
    void getSmallestWeatherDifference() {
        assertEquals(14, DataService.getDayOfSmallestTemperatureSpread());
    }
}
