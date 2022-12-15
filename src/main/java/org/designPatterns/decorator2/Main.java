package org.designPatterns.decorator2;

public class Main {
    public static void main(String args[]){
        Expresso expresso = new Expresso();
        MochaDecorator mochaDecorator = new MochaDecorator(expresso);
        MochaDecorator mochaDecorator1 = new MochaDecorator(mochaDecorator);
        System.out.println(mochaDecorator1.getDescription());
        System.out.println(mochaDecorator1.cost());
    }
}
