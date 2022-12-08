package org.designPatterns.decorator;

public class Main {
    public static void main(String args[]){
        // here we are decorating base pizza with different toppings
        Pizza pizza = new CheeseBurstDecorator(new JalepanoDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
