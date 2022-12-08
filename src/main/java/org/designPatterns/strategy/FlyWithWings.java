package org.designPatterns.strategy;

public class FlyWithWings implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
