package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class RestaurantUI {

    RestaurantMenu menus;
    RestaurantService service;

    public RestaurantUI(RestaurantService service) {
        this.service = service;
    }

    public void result(){
        menus = new RestaurantMenu();
        service = new RestaurantService();

        Item item01 = new Item("짜장면",6000);
        Item item02 = new Item("간짜장",7500);
        Item item03 = new Item("해물짬뽕",7000);
        Item item04 = new Item("만두",5000);
        Item item05 = new Item("볶음밥",7500);
        Item[] chMenus = menus.menuSetting(item01,item02,item03,item04,item05);

        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());

        Item[] chChoice = service.itemSearch(chMenus, money);
        Item chOrder = service.itemSelect();

        System.out.println("현재 메뉴는 "+Arrays.toString(chMenus)+"가 준비되어 있습니다.");
        System.out.println("구매 하실 수 있는 메뉴는 "+Arrays.toString(chChoice)+"가 있습니다.");
        System.out.println("최대가격으로 구매하실 수 있는 메뉴는 "+chOrder.name+"이며, 가격은 "+chOrder.price+"원 입니다.");
    }
}
