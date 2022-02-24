package com.company;
import java.util.Scanner;
public class RestaurantUI {
    RestaurantService service;

    public RestaurantUI(RestaurantService service) {
        this.service = service;
    }

    public void result(){
        service = new RestaurantService();
        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        Item chOrder = service.itemSearch(money);
        System.out.println("최대가격으로 구매하실 수 있는 메뉴는 "+chOrder.name+"이며, 가격은 "+chOrder.price+"원 입니다.");
    }
}
