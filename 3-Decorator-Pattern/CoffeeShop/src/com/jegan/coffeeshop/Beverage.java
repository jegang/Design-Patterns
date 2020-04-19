package com.jegan.coffeeshop;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTE};
    Size size = Size.TALL;
    String description = "No idea of beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
