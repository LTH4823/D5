package zerock.ui;

import java.util.Scanner;

public class BasicUI {

    private Scanner scanner;

    public BasicUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void print(String msg){
        System.out.println(msg);
    }

    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public int inputInt(String msg){
        String inputStr = input(msg);
        return Integer.parseInt(inputStr);
    }

    public void execute(){

    }

}
