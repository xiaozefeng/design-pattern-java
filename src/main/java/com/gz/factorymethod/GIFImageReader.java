package com.gz.factorymethod;

public class GIFImageReader implements ImageReader {
    @Override
    public void read() {
        System.out.println("读取GIF图片");
    }
}
