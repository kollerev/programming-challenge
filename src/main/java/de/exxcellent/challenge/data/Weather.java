package de.exxcellent.challenge.data;

/**
 * Weather class only contains the data that is needed for example, but can easily be enhanced
 */

public class Weather {

    private int day;
    private int maximumTemperature;
    private int minimumTemperature;
    private int temperatureSpread;

    public Weather(int day, int maximumTemperature, int minimumTemperature, int temperatureSpread) {
        this.day = day;
        this.maximumTemperature = maximumTemperature;
        this.minimumTemperature = minimumTemperature;
        this.temperatureSpread = temperatureSpread;
    }

    public int getDay() {
        return day;
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }


}
