package org.designPatterns.decorator2;

public class MochaDecorator extends CondimentDecorator{
    public MochaDecorator(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public float cost() {
        return bevarage.cost()+4.4f;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Mocha";
    }
}
