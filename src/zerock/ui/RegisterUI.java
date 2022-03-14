package zerock.ui;

import java.util.Scanner;

public class RegisterUI extends BasicUI{

    public RegisterUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        print("이 화면은 등록시에 사용하는 화면입니다.");
    }
}
