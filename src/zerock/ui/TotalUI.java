package zerock.ui;

import java.util.Scanner;

public class TotalUI{

    private BasicUI[] uis;
    private Scanner scanner;

    public TotalUI(BasicUI[] uis, Scanner scanner) {
        this.uis = uis;
        this.scanner = scanner;
    }

    public void display(){
        System.out.println("0:Register, 1:Read, 2:Remove, -1:Exit");

        int idx = Integer.parseInt(scanner.nextLine());

        if(idx == -1){
            System.out.println("Exit................");
            return;
        }

        uis[idx].execute();

        display();

    }

}









