package de.exxcellent.challenge.storage;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.data.Football;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.parser.CSVParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballDataStorageTest {

    private CSVParser csvParser = new CSVParser();

    @Test
    void convertStringToFootballList() {
        List<List<String>> csvData = csvParser.readFile(FilePath.footballFilePath);
        List<Football> footballData = FootballDataStorage.convertStringToFootballList(csvData);
        assertEquals(footballData.get(0).getTeamName(), "Arsenal", "Team  name was not correct");
        assertEquals(footballData.get(0).getGoals(), 79, "Number of goals was not correct");
        assertEquals(footballData.get(0).getGoalsAllowed(), 36, "Number of allowed goals was not correct");
    }
}
