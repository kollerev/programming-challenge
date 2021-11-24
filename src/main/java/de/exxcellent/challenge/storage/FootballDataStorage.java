package de.exxcellent.challenge.storage;

import de.exxcellent.challenge.constants.Index;
import de.exxcellent.challenge.data.Football;
import de.exxcellent.challenge.data.Weather;

import java.util.ArrayList;
import java.util.List;

public class FootballDataStorage {

    public static List<Football> convertStringToFootballList(List<List<String>> csvData) {
        List<Football> footballList = new ArrayList<Football>();

        if (csvData.size() > 0) {
            //start with 1, omit header
            for (int line = 1; line < csvData.size(); line++) {
                String teamName = csvData.get(line).get(Index.COLUMN_TEAM_NAME);
                int goals = Integer.parseInt(csvData.get(line).get(Index.COLUMN_GOALS));
                int goalsAllowed = Integer.parseInt(csvData.get(line).get(Index.COLUMN_GOALS_ALLOWED));
                int goalsDistance = Math.abs(goals - goalsAllowed);
                footballList.add(new Football(teamName, goals, goalsAllowed, goalsDistance));
            }
        }
        return footballList;
    }
}
