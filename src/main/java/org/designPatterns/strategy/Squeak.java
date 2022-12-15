package org.designPatterns.strategy;

public class Squeak implements QuackingBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
