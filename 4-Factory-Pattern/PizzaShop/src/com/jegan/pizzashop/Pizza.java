package com.jegan.pizzashop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings :");

        toppings.forEach(topping -> System.out.println("   " + topping));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza at diagonal shapes");
    }

    void box() {
        System.out.println("Place pizza in official pizza shop box");
    }

    public String getName() {
        return name;
    }
}
