package com.jegan.pizzashop;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago style Veggie Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Vegetables Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
