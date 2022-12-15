package org.designPatterns.strategy;

public abstract class Duck {
    String description;
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;
    public void performFly(){
        flyingBehaviour.fly();
    }
    public void performQuack(){
        quackingBehaviour.quack();
    }
    public void showDescription(){
        System.out.println(description);
    }
}
