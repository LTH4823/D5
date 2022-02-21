package com.company;
import java.util.Scanner;

public class RestaurantUI {
    Restaurant ch = new Restaurant();
    public void result(){
        int money = 0;
        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        money = Integer.parseInt(scanner.nextLine());
        Item chSelect = ch.itemList(money);
        System.out.println("최대 구매가능 메뉴는 "+chSelect.name+"이며, 가격은 "+chSelect.price+"입니다.");
    }
}
