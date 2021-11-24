package de.exxcellent.challenge;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.parser.CSVParser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Evelyn Koller>
 */
class AppTest {

    private CSVParser csvParser = new CSVParser();


    @Test
    @DisplayName("Read content from csv file to List<List<String>>")
    void readCSVFile() {
        List<List<String>> csvData = csvParser.readFile(FilePath.testCSVFilePath);
        assertTrue(csvData.size() > 0);
    }
}