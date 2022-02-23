package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantService();
        RestaurantUI ui = new RestaurantUI(service);
        ui.result();
    }
}
