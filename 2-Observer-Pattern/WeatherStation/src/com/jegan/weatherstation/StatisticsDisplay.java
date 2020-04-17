package com.jegan.weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 200.0f;
    private float minTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numTemperatures = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numTemperatures += 1;

        maxTemp = Math.max(temp, maxTemp);
        minTemp = Math.min(temp, minTemp);

        display();
    }
}
