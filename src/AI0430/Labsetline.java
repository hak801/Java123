package AI0430;

import java.util.Scanner;

public class Labsetline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long fact = 1;
        System.out.print("학생의 수를 입력하세요:");
        long friends_num = s.nextInt();

        for(int i = 1; i<= friends_num; i++) {
            fact = fact*i;
        }

        System.out.printf("학생 %d명을 순서대로 세우는 경우의 수: %d", friends_num, fact);
    }
}
