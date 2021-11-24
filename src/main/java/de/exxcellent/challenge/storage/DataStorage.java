package de.exxcellent.challenge.storage;

import de.exxcellent.challenge.constants.FilePath;
import de.exxcellent.challenge.constants.Index;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.parser.CSVParser;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    public static List<Weather> convertStringToWeatherList(List<List<String>> csvData) {
        List<Weather> weatherData = new ArrayList<>();
        Weather newWeather;

        if (csvData.size() > 0) {
            //omit header line and start at index 1
            for (int line = 1; line < csvData.size(); line++) {
                int day = Integer.parseInt(csvData.get(line).get(Index.COLUMN_DAY));
                int maximumTemperature = Integer.parseInt(csvData.get(line).get(Index.COLUMN_MAX_TEMP));
                int minimumTemperature = Integer.parseInt(csvData.get(line).get(Index.COLUMN_MIN_TEMP));
                int temperatureSpread = maximumTemperature - minimumTemperature;

                weatherData.add(new Weather(day, maximumTemperature, minimumTemperature, temperatureSpread));
            }
        }
        return weatherData;
    }

    public static List<Weather> getWeatherData() {
        List<List<String>> weatherCSVData = new CSVParser().readFile(FilePath.weatherFilePath);
        return convertStringToWeatherList(weatherCSVData);
    }
}
