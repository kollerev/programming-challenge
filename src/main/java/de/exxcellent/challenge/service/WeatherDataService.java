package de.exxcellent.challenge.service;

import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.storage.WeatherDataStorage;
import de.exxcellent.challenge.utils.CalculationUtils;

import java.util.List;

public class WeatherDataService {

    /**
     *
     * check for the lowest value and assign it as smallestTemperatureSpread
     */
    public static int getDayOfSmallestTemperatureSpread() {
        int day = -1;
        int smallestTemperatureSpread = Integer.MAX_VALUE;
        List<Weather> data = getWeatherData();
        for (int i = 0; i < data.size(); i++) {
            int temperatureSpread = CalculationUtils.absoluteDistance(data.get(i).getMaximumTemperature(), data.get(i).getMinimumTemperature());
            if (temperatureSpread < smallestTemperatureSpread) {
                smallestTemperatureSpread = temperatureSpread;
                day = data.get(i).getDay();
            }
        }
        return day;
    }

    public static List<Weather> getWeatherData() {
        return WeatherDataStorage.getWeatherData();
    }
}
