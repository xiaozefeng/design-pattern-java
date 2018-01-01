package com.gz.simple_factory;

/**
 * @author xiaozefeng
 */
public class UnSupportedShapeException extends Exception {
    public UnSupportedShapeException() {
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }
}
