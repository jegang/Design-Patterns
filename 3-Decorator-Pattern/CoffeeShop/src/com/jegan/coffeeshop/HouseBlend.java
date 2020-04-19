package com.jegan.coffeeshop;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return Util.computeCostBasedOnSize(size, 0.89);
    }
}
