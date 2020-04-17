package com.jegan.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 30.0f;
    private float prevPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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

    @Override
    public void update(float temp, float humidity, float pressure) {
        prevPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
