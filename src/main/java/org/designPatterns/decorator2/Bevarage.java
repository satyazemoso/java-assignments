package org.designPatterns.decorator2;

public abstract class Bevarage {
    String description;
    public String getDescription(){
        return description;
    }
    public abstract float cost();
}
