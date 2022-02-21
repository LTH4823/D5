package com.company;

public class Restaurant  {
    Item item01 = new Item("짜장면",6000);
    Item item02 = new Item("간짜장",7500);
    Item item03 = new Item("해물짬뽕",7000);
    Item item04 = new Item("만두",5000);
    Item item05 = new Item("볶음밥",7500);
    Item maxItem = new Item("",0);
    Item[] items = new Item[5];

    int count =0;
    int arrNum =0;

    public Item itemList(int money) {
        items[0] = item01;
        items[1] = item02;
        items[2] = item03;
        items[3] = item04;
        items[4] = item05;

        Item[] itemSearch = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (money >= items[i].price) {
                itemSearch[i] = items[i];
                if (items[i] != null) {
                    count++;
                    arrNum++;
                }
            }
        }
        Item[] itemCheck = new Item[count];
        for (Item temp : itemSearch) {
            if (temp != null) {
                itemCheck[arrNum - 1] = temp;
                arrNum--;
            }
        }
        for (Item temp : itemCheck) {
            if (maxItem.price < temp.price) {
                maxItem = temp;
            }
        }
        return maxItem;
    }
}
