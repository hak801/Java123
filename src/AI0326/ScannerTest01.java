package AI0326;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("출생년도를 입력하세요.:");

        int num = s.nextInt();

        System.out.println("당신의 출생년도는"+ num +"살입니다.");
        s.close();
    }
}
