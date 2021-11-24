package de.exxcellent.challenge;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.parser.CSVParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CSVParserTest {

    private CSVParser csvParser = new CSVParser();

    @Test
    @DisplayName("Read content from csv file to List<List<String>>")
    void readCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testCSVFilePath);
        assertTrue(csvData.size() > 0);
    }

    @Test
    @DisplayName("Test if all lines are added to the list")
    void getAllLinesFromCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testCSVFilePath);
        assertEquals(4, csvData.size());
    }
}
