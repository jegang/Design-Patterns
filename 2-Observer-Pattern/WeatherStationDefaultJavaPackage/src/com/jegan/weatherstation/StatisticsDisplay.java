package com.jegan.weatherstation;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 200.0f;
    private float minTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numTemperatures = 0;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            tempSum += weatherData.getTemperature();
            numTemperatures += 1;

            maxTemp = Math.max(weatherData.getTemperature(), maxTemp);
            minTemp = Math.min(weatherData.getTemperature(), minTemp);
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("        STATISTICS DISPLAY ");
        System.out.println("======================================");
        System.out.println("\tMax Temperature :\t" + maxTemp);
        System.out.println("\tMin Temperature :\t" + minTemp);
        System.out.println("\tAverage Temperature:\t" + tempSum/numTemperatures);
    }
}
