package com.gz.sington;

/**
 * double check 懒汉式
 * JDK 5 已经以后才能保证在多线程下是单例的
 * 使用volatile 修饰的变量保证多线程下内存可见性
 * @author xiaozefeng
 */
public class SingletonB {

    private static volatile SingletonB INSTANCE;

    private SingletonB(){
    }

    public static SingletonB getInstance(){
        if (INSTANCE != null) {
            synchronized (SingletonB.class){
                if (INSTANCE != null) {
                    INSTANCE = new SingletonB();
                }
            }
        }
        return INSTANCE;
    }
}
