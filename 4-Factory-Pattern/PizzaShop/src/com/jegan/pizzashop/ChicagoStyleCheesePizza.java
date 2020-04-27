package com.jegan.pizzashop;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style Deep Fish Cheese Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozerella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
