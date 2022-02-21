package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class RestaurantUI {
    RestaurantMenus menus = new RestaurantMenus();
    Restaurant ch = new Restaurant();
    int money;

    public void result(){

        Item item01 = new Item("짜장면",6000);
        Item item02 = new Item("간짜장",7500);
        Item item03 = new Item("해물짬뽕",7000);
        Item item04 = new Item("만두",5000);
        Item item05 = new Item("볶음밥",7500);
        Item[] chMenus = menus.menuSetting(item01,item02,item03,item04,item05);

        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        money = Integer.parseInt(scanner.nextLine());
        Item chSelect = ch.itemSearch(chMenus,money);

        System.out.println("최대 구매가능한 메뉴는 "+chSelect.name+"이며, 가격은 "+chSelect.price+"입니다.");
    }
}
