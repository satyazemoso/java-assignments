package org.designPatterns.abstractFactory;

public class RoundShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if(type.equals("SQUARE")){
            return new RoundedSquare();
        }
        else{
            return new RoundedRectangle();
        }
    }
}
