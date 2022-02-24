package com.company;
public class RestaurantService {
    Item maxItem;
    public Item itemSearch(int money) {
        int count =0, arrNum =0;
        Item item01 = new Item("짜장면",6000);
        Item item02 = new Item("간짜장",7500);
        Item item03 = new Item("해물짬뽕",7000);
        Item item04 = new Item("만두",5000);
        Item item05 = new Item("볶음밥",7500);
        Item[] itemMenus = new RestaurantMenu().menuSetting(item01,item02,item03,item04,item05);
        Item[] itemNullCheck = new Item[itemMenus.length];
        for (int i = 0; i < itemMenus.length; i++) {
            if (money >= itemMenus[i].price) {
                itemNullCheck[i] = itemMenus[i];
                if (itemMenus[i] != null) {
                    count++;
                    arrNum++;
                }
            }
        }
        Item[] itemChoice = new Item[count];
        for (Item temp : itemNullCheck) {
            if (temp != null) {
                itemChoice[arrNum - 1] = temp;
                arrNum--;
            }
        }
        maxItem = new Item("",0);
        for (Item temp : itemChoice) {
            if (maxItem.price < temp.price) {
                maxItem = temp;
            }
        }
        return maxItem;
    }
}
