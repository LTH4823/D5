package com.company;

public class RestaurantService {
    Item maxItem;
    Item[] itemList;
    Item[] itemCheck;

    public Item[] itemSearch(Item[] items,int money) {

        int count =0, arrNum =0;
        itemList = new Item[items.length];

        for (int i = 0; i < items.length; i++) {
            if (money >= items[i].price) {
                itemList[i] = items[i];
                if (items[i] != null) {
                    count++;
                    arrNum++;
                }
            }
        }

        itemCheck = new Item[count];
        for (Item temp : itemList) {
            if (temp != null) {
                itemCheck[arrNum - 1] = temp;
                arrNum--;
            }
        }


        return itemCheck;
    }

        public Item itemSelect(){
        maxItem = new Item("",0);
        for (Item temp : itemCheck) {
                if (maxItem.price < temp.price) {
                    maxItem = temp;
                }
            }
        return maxItem;
        }

}
