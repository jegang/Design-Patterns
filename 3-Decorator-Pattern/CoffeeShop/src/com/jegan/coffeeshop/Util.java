package com.jegan.coffeeshop;

public class Util {
    public static double computeCostBasedOnSize(Beverage.Size size, double basePrice) {
        switch(size){
            case GRANDE:
                return 1.5 * basePrice;
            case VENTE:
                return 2 * basePrice;
            default:
                return basePrice;
        }
    }
}
