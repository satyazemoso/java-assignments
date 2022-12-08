package org.designPatterns.decorator;

public class JalepanoDecorator extends PizzaDecorator{

    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake()+addJalpanos();
    }

    private String addJalpanos() {
        return "jalpanos";
    }
}
