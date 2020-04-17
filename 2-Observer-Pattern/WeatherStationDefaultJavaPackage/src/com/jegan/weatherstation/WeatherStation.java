package com.jegan.weatherstation;

import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args) {
        Observable observable = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(observable);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(observable);
        ForecastDisplay forecastDisplay = new ForecastDisplay(observable);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(observable);

        WeatherData weatherData = (WeatherData) observable;
        weatherData.setMeasurements(79, 70, 30.4f);
        weatherData.setMeasurements(81, 65, 28.4f);
        weatherData.setMeasurements(80, 68, 29.6f);
    }
}
