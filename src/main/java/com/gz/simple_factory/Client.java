package com.gz.simple_factory;


import com.gz.uitils.XmlUtil;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) throws UnSupportedShapeException {
        String brandName = XmlUtil.getBrandName("configShape.xml");
        Shape shape = ShapeFactory.createShape(brandName);
        System.out.println(shape.draw());
        System.out.println(shape.erase());
    }
}
