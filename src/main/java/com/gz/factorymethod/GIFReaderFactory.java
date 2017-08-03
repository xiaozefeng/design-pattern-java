package com.gz.factorymethod;

public class GIFReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader createImageReader() {
        return new GIFImageReader();
    }
}
