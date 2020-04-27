package com.jegan.pizzashop;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {

        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepporiniPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return null;
        }
    }
}
