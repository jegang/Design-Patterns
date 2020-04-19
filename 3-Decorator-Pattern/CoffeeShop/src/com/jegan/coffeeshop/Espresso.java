package com.jegan.coffeeshop;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return Util.computeCostBasedOnSize(size, 1.99);
    }
}
