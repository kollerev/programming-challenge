package de.exxcellent.challenge;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.parser.CSVParser;
import de.exxcellent.challenge.storage.DataStorage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CSVParserTest {

    private CSVParser csvParser = new CSVParser();

    @Test
    void readCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testCSVFilePath);
        assertTrue(csvData.size() > 0);
    }

    @Test
    void getAllLinesFromCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testCSVFilePath);
        assertEquals(4, csvData.size());
    }

    @Test
    void getAllLinesFromWeatherCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.weatherFilePath);
        assertEquals(31, csvData.size());
    }

    @Test
    void convertStringToWeatherList() {
        List<List<String>> csvData = csvParser.readFile(FilePath.weatherFilePath);
        List<Weather> weatherData = DataStorage.convertStringToWeatherList(csvData);
        assertEquals(weatherData.get(0).getDay(), 1);
        assertEquals(weatherData.get(0).getMaximumTemperature(), 88);
        assertEquals(weatherData.get(0).getMinimumTemperature(), 59);
    }
}
