package org.designPatterns.builder;

public class BurgerMain {
    public static void main(String args[]){
        Burger burger = new Burger.BurgerBuilder().size("LARGE").egg(true).mayoneese(true).extraCheese(true).lettuce(false).egg(true).build();
        System.out.println(burger.getSize());
    }
}
