package org.designPatterns.strategy;

public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
