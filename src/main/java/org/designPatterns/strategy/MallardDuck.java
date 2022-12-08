package org.designPatterns.strategy;

public class MallardDuck extends Duck{
    public MallardDuck(String description,FlyingBehaviour flyingBehaviour,QuackingBehaviour quackingBehaviour){
        this.description = description;
        this.flyingBehaviour = flyingBehaviour;
        this.quackingBehaviour = quackingBehaviour;

    }
}
