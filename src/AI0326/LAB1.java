package AI0326;

import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("받는 사람을 입력하세요.:");
        String name = s1.nextLine();
        System.out.println("주소를 입력하세요.:");
        String addres = s1.nextLine();
        System.out.println("무게를 입력하세요.(g)");
        int weigth = s2.nextInt();



        System.out.println("받는 사람===>" + name);
        System.out.println("주소===>" + addres);
        System.out.println("배송비===>" + (weigth * 5) + "원이다.");

        s1.close();
        s2.close();
    }
}
