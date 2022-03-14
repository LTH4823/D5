package zerock.ui;

import java.util.Scanner;

public class ReadUI extends BasicUI{

    public ReadUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.println("조회하는 화면입니다.");
    }
}
