package zerock.ui;

import java.util.Scanner;

public class RemoveUI extends BasicUI{
    public RemoveUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        print("삭제하는 화면입니다.");
    }
}
