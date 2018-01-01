package com.gz.garnisher.headfirst;

/**
 * 计算价格的抽象类
 * @author xiaozefeng
 */
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
