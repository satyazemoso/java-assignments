package org.designPatterns.adapter;

public class GroceryItemAdapter implements Item{
    GroceryItem groceryItem;
    public GroceryItemAdapter(GroceryItem groceryItem){
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getGroceryName();
    }

    @Override
    public int getItemPrice() {
        return groceryItem.getGroceryItemPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
