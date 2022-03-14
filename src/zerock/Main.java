package zerock;

import org.zerock.ui.*;

import java.util.Scanner;

public class Main {

    public static void order(Store store){
        store.makeZazang();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BasicUI[] uis = new BasicUI[3];
        uis[0] = new RegisterUI(scanner);
        uis[1] = new ReadUI(scanner);
        uis[2] = new RemoveUI(scanner);

        TotalUI totalUI = new TotalUI(uis,scanner);

        totalUI.display();

//        Scanner scanner = new Scanner(System.in);
//        BasicUI ui = new SampleUI(scanner);
//
//        String name = ui.input("Your Name");
//
//        System.out.println(name);
    }

}
