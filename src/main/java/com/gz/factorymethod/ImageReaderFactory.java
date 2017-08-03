package com.gz.factorymethod;

public interface ImageReaderFactory {

    /**
     * 创建图片读取器
     * @return
     */
     ImageReader createImageReader();

    /**
     * 默认方法
     */
    default void read(){
         this.createImageReader().read();
     }
}
