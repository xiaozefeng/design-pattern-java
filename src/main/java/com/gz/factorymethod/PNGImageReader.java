package com.gz.factorymethod;

public class PNGImageReader implements ImageReader {
    @Override
    public void read() {
        System.out.println("读取PNG图片");
    }
}
