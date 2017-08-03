package com.gz.sington;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void testSingletonA(){
        assertEquals(SingletonA.getInstance(), SingletonA.getInstance());
    }

    @Test
    public void testSingletonB(){
        assertEquals(SingletonB.getInstance(), SingletonB.getInstance());
    }

    @Test
    public void testSingletonC(){
        assertEquals(SingletonC.INSTANCE, SingletonC.INSTANCE);
    }

    @Test
    public void testSingletonD(){
        assertEquals(SingletonD.getInstance(), SingletonD.getInstance());
    }


}