package de.exxcellent.challenge.service;

import de.exxcellent.challenge.data.Football;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.storage.FootballDataStorage;
import de.exxcellent.challenge.storage.WeatherDataStorage;
import de.exxcellent.challenge.utils.CalculationUtils;

import java.util.List;

public class FootballDataService {

    public static String getTeamNameOfSmallestGoalsDistance() {
        String teamName = "";
        int smallestGoalsDistance = Integer.MAX_VALUE;
        List<Football> data = getFootballData();
        for (int i = 0; i < data.size(); i++) {
            int teamSmallestGoalsDistance = CalculationUtils.absoluteDistance(data.get(i).getGoals(), data.get(i).getGoalsAllowed());
            if (teamSmallestGoalsDistance < smallestGoalsDistance) {
                smallestGoalsDistance = teamSmallestGoalsDistance;
                teamName = data.get(i).getTeamName();
            }
        }
        return teamName;
    }

    public static List<Football> getFootballData() {
        return FootballDataStorage.getFootballData();
    }
}
