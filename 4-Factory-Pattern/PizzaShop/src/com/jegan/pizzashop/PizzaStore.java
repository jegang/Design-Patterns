package com.jegan.pizzashop;

public abstract class PizzaStore  {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type); // Factory method - creates instance based in the type of pizza
}
