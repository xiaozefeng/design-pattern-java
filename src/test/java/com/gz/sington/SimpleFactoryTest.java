package com.gz.sington;

import com.gz.simple.factory.Shape;
import com.gz.simple.factory.ShapeFactory;
import com.gz.simple.factory.UnSupportedShapeException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleFactoryTest {
    @Test
    public void createShapeTest() throws UnSupportedShapeException{
        Shape circle = ShapeFactory.createShape("circle");
        assertEquals(circle.draw(),"Drawing Circle");
        assertEquals(circle.erase(),"Erasing Circle");
    }
}
