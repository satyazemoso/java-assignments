package org.designPatterns.builder;

public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean onion;
    private boolean mayoneese;
    private boolean lettuce;

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isMayoneese() {
        return mayoneese;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    private Burger(BurgerBuilder burgerBuilder){
        // do all validations here
        if(burgerBuilder.size == null){
            System.out.println("size can not be blank");
        }
        // set all Burger properites with BurgerBuilder propeties
        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.mayoneese = burgerBuilder.mayoneese;
        this.lettuce = burgerBuilder.mayoneese;
        this.onion = burgerBuilder.onion;

    }
    public static class BurgerBuilder{
         String size;
         boolean egg;
         boolean extraCheese;
         boolean onion;
         boolean mayoneese;
         boolean lettuce;
         public BurgerBuilder size(String size){
             this.size = size;
             return this;
        }
        public BurgerBuilder egg(boolean egg){
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }
        public BurgerBuilder onion(boolean onion){
            this.onion = onion;
            return this;
        }
        public BurgerBuilder mayoneese(boolean mayoneese){
            this.mayoneese = mayoneese;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public Burger build(){
             return new Burger(this);
        }


    }

}
