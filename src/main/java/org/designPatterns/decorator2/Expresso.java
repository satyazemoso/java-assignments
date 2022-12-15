package org.designPatterns.decorator2;

public class Expresso extends Bevarage{
    public String getDescription(){
        return "Expresso";
    }

    @Override
    public float cost() {
        return 2.2f;
    }
}
