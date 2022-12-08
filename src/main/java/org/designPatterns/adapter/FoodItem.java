package org.designPatterns.adapter;

public class FoodItem implements Item{
    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public int getItemPrice() {
        return 0;
    }

    @Override
    public String getRestaurantName() {
        return null;
    }
}
