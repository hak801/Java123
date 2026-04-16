package AI0402;

import java.util.Scanner;

public class simpcal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요.:");
        int num1 = s.nextInt();
        System.out.print("정수를 입력하세요.:");
        int num2 = s.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %.5f\n", num1, num2, (double)num1 / num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        s.close();
    }
}
