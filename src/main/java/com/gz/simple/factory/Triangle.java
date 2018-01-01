package com.gz.simple.factory;

/**
 * 三角形
 * @author xiaozefeng
 */
public class Triangle implements Shape{

    @Override
    public String draw() {
        return "Drawing Triangle";
    }

    @Override
    public String erase() {
        return "Erasing Triangle";
    }
}
