package com.jegan.weatherstation;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 30.0f;
    private float prevPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            prevPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("        FORECAST DISPLAY ");
        System.out.println("======================================");
        if(currentPressure < prevPressure) {
            System.out.println("Expect some rain.");
        }
        else if(currentPressure > prevPressure) {
            System.out.println("Weather is going to get better.");
        }
        else {
            System.out.println("Weather is more of the same.");
        }
    }
}
