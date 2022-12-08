package org.designPatterns.adapter;

public class GroceryProduct implements GroceryItem{
    @Override
    public String getGroceryName() {
        return null;
    }

    @Override
    public int getGroceryItemPrice() {
        return 0;
    }

    @Override
    public String getStoreName() {
        return null;
    }
}
