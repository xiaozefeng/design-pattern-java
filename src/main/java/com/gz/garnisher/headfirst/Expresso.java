package com.gz.garnisher.headfirst;

/**
 * 浓缩咖啡
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
