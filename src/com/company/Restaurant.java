package com.company;

import java.util.Arrays;

public class Restaurant  {
    int cout =0;
    int arrNum =0;

    public Item[] itemSelct(Item[] items,int money){
        Item[] itemSearch = new Item[items.length];
        for (int i =0; i<items.length; i++){
            if (money>=items[i].price){
                itemSearch[i]=items[i];
                if (items[i]!=null){
                    cout ++;
                    arrNum ++;
                }
            }
        }

        Item[] itemCheck= new Item[cout];
        for (Item temp:itemSearch) {
            if (temp !=null){
                itemCheck[arrNum-1]=temp;
                arrNum --;
            }
        }

        return itemCheck;
    }

}
