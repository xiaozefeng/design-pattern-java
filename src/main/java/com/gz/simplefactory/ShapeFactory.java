package com.gz.simplefactory;

/**
 * @author xiaozefeng
 */
public class ShapeFactory {

    private ShapeFactory() {
    }
    public static Shape createShape(String shapeName) throws UnSupportedShapeException {
        assert shapeName != null && !"".equals(shapeName);
        if (shapeName.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        throw new UnSupportedShapeException("未定义图形");
    }
}
