package org.designPatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Item> swiggyStore = new ArrayList<>();
        swiggyStore.add(new FoodItem());
        swiggyStore.add(new FoodItem());
        // here by using adapter pattern we converted GroceryItem as FoodItem
        swiggyStore.add(new GroceryItemAdapter(new GroceryProduct()));

    }
}
