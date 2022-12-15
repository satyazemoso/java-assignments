package org.designPatterns.decorator2;

public class SoyaDecorator extends CondimentDecorator{
    public SoyaDecorator(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public float cost() {
        return bevarage.cost()+3.3f;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Soya";
    }
}
