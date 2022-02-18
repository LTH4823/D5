package com.company;
import java.util.Arrays;

public class Restaurant  {
    Item item01 = new Item("짜장면",6000);
    Item item02 = new Item("간짜장",7500);
    Item item03 = new Item("해물짬뽕",7000);
    Item item04 = new Item("만두",5000);
    Item item05 = new Item("볶음밥",7500);
    Item[] items = new Item[5];

    public Item[] itemSet(){
        items[0]=item01;
        items[1]=item02;
        items[2]=item03;
        items[3]=item04;
        items[4]=item05;
        return items;
    }

    public Restaurant() {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
