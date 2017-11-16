package com.gz.sington;

/**
 * 饿汉式
 * @author xiaozefeng
 */
public class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA();

    private SingletonA(){
    }

    public static SingletonA getInstance(){
        return INSTANCE;
    }
}
