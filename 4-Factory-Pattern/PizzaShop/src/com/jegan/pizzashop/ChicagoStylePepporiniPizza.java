package com.jegan.pizzashop;

public class ChicagoStylePepporiniPizza extends Pizza {
    public ChicagoStylePepporiniPizza() {
        name = "Chicago style Pepperoni Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Cheese Tomato");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
