package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Item[] ch = new ItemArr().itemSet();
        int money = 0;
        Item maxItem = new Item("",0);
        Item minItem = new Item("",100000);;

        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        money = Integer.parseInt(scanner.nextLine());
        Item[] chSelct = new Restaurant().itemSelct(ch, money);
        for (Item temp : chSelct) {
            if (maxItem.price < temp.price) {
                maxItem = temp;
            }
            if (minItem.price > temp.price) {
                minItem = temp;
            }
        }

        System.out.println("최대 구매가능 메뉴는 "+maxItem.name+"이며, 가격은 "+maxItem.price+"입니다.");
        System.out.println("최소 구매가능 메뉴는 "+minItem.name+"이며, 가격은 "+minItem.price+"입니다.");
    }
}
