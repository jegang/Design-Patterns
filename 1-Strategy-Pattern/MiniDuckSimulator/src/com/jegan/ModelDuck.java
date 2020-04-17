package com.jegan;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}
