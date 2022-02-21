package com.company;

public class Restaurant  {
    int count;
    int arrNum;
    public Item itemSearch(Item[] items,int money) {
        Item maxItem = new Item("",0);
        Item[] itemList = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (money >= items[i].price) {
                itemList[i] = items[i];
                if (items[i] != null) {
                    count++;
                    arrNum++;
                }
            }
        }
        Item[] itemCheck = new Item[count];
        for (Item temp : itemList) {
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
