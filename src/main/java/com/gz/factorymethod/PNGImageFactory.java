package com.gz.factorymethod;

/**
 * @author xiaozefeng
 */
public class PNGImageFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new PNGImageReader();
    }

}
