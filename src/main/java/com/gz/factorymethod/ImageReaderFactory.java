package com.gz.factorymethod;

public interface ImageReaderFactory {

    /**
     * 创建图片读取器
     * @return
     */
     ImageReader createImageReader();
}
