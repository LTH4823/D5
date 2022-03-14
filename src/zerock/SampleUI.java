package zerock;

import org.zerock.ui.BasicUI;

import java.util.Scanner;

public class SampleUI extends BasicUI {

    public SampleUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String input(String msg) {
        System.out.println("-------------------------");
        String result =  super.input(msg);
        System.out.println(result);
        System.out.println("=============================");
        return result;
    }

}
