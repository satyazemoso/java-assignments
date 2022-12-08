package org.designPatterns.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String type) {
        if(type.equals("SQUARE")){
            return new Square();
        }
        else {
            return new Rectangle();
        }
    }
}
