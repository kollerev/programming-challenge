package de.exxcellent.challenge.storage;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.parser.CSVParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataStorageTest {

    private CSVParser csvParser = new CSVParser();

    @Test
    void convertStringToWeatherList() {
        List<List<String>> csvData = csvParser.readFile(FilePath.weatherFilePath);
        List<Weather> weatherData = WeatherDataStorage.convertStringToWeatherList(csvData);
        assertEquals(weatherData.get(0).getDay(), 1);
        assertEquals(weatherData.get(0).getMaximumTemperature(), 88);
        assertEquals(weatherData.get(0).getMinimumTemperature(), 59);
    }
}
