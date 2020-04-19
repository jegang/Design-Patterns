package com.jegan.coffeeshop;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return Util.computeCostBasedOnSize(size, 0.99);
    }
}
