package com.gz.sington;

/**
 * 静态内部类实现懒加载的单例
 * @author xiaozefeng
 */
public class SingletonD {

    private SingletonD(){
    }

    private static class SingletonDLoader{
        private static final SingletonD INSTANCE = new SingletonD();
    }

    public static SingletonD getInstance(){
        return SingletonDLoader.INSTANCE;
    }
}
