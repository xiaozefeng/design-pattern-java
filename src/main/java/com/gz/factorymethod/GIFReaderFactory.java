package com.gz.factorymethod;

/**
 * @author xiaozefeng
 */
public class GIFReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader createImageReader() {
        return new GIFImageReader();
    }
}
