package com.gz.factorymethod;

public class PNGImageFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new PNGImageReader();
    }

}
