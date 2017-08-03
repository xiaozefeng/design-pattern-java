package com.gz.sington;

import java.util.Arrays;

/**
 * 枚举实现单例
 */
public enum SingletonC {
    INSTANCE;

    private String[] companys = {"Google", "Apple", "Microsoft"};

    public void printCompanys(){
        System.out.println(Arrays.toString(companys));
    }
}
