package org.designPatterns.decorator;

public class BasePizza implements Pizza{

    @Override
    public String bake() {
        return "Base pizza";
    }
}
