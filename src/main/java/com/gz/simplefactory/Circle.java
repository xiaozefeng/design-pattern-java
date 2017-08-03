package com.gz.simplefactory;

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
