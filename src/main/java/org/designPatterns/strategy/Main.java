package org.designPatterns.strategy;

public class Main {
    public static void main(String args[]){
        Duck mallardDuck = new MallardDuck("mallard duck",new FlyWithWings(),new Squeak());
        mallardDuck.showDescription();
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
}
