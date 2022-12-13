package org.designPatterns.decorator2;

public class Decaf extends Bevarage{
    public String getDescription(){
        return "Decaf";
    }

    @Override
    public float cost() {
        return 1.1f;
    }
}
