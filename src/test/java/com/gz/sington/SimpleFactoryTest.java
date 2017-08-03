package com.gz.sington;

import com.gz.simplefactory.Shape;
import com.gz.simplefactory.ShapeFactory;
import com.gz.simplefactory.UnSupportedShapeException;
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
