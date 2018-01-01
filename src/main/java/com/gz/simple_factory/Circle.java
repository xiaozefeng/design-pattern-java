package com.gz.simple_factory;

/**
 *
 * @author xiaozefeng
 */
public class Circle implements Shape {
    @Override
    public String draw() {
        return "Drawing Circle";
    }

    @Override
    public String erase() {
        return "Erasing Circle";
    }
}
