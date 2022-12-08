package org.designPatterns.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String args[]){
        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);
        Shape squareShape = abstractFactory.getShape("SQUARE");
        squareShape.draw();
        Shape rectangleShape = abstractFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(false);
        Shape square = abstractFactory1.getShape("SQUARE");
        square.draw();
        Shape rectangle = abstractFactory1.getShape("RECTANGLE");
        rectangle.draw();

    }
}
