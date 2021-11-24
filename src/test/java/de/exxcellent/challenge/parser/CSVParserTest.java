package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.constants.FilePath;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CSVParserTest {

    private CSVParser csvParser = new CSVParser();

    @Test
    void readCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testFootballCSVFilePath);
        assertTrue(csvData.size() > 0);
    }

    @Test
    void getAllLinesFromCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testFootballCSVFilePath);
        assertEquals(4, csvData.size());
    }

    @Test
    void getAllLinesFromWeatherCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.weatherFilePath);
        assertEquals(31, csvData.size());
    }

    @Test
    void getAllLinesFromFootballCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.footballFilePath);
        assertEquals(21, csvData.size());
    }
}
