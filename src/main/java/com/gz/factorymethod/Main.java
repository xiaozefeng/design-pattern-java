package com.gz.factorymethod;

public class Main {
    public static void main(String[] args) {
        //创建GIF读取器
        ImageReaderFactory factory = new GIFReaderFactory();
        ImageReader imageReader = factory.createImageReader();
        imageReader.read();

        //读取PNG读取器
        ImageReaderFactory factory1 = new PNGImageFactory();
        ImageReader imageReader1 = factory1.createImageReader();
        imageReader1.read();
    }
}
