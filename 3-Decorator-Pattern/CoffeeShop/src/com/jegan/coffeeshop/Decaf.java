package com.jegan.coffeeshop;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaff Coffee";
    }

    @Override
    public double cost() {
        return Util.computeCostBasedOnSize(size, 1.05);
    }
}
