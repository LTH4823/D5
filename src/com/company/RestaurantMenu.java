package com.company;

import java.util.Arrays;

public class RestaurantMenu {
    Item[] items;

    @Override
    public String toString() {
        return "RestaurantMenu{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public Item[] menuSetting(Item item01, Item item02, Item item03, Item item04, Item item05){
        items = new Item[5];
        items[0] = item01;
        items[1] = item02;
        items[2] = item03;
        items[3] = item04;
        items[4] = item05;
        return items;
    }
}
