package AI0514;

import java.util.Scanner;

public class Whilelooptest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2;
        int sum;

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요.:");
            num1 = s.nextInt();
            if (num1 == -1)
                break;

            System.out.print("두 번째 정수를 입력하세요.:");
            num2 = s.nextInt();

            sum = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }

        s.close();
    }
}
