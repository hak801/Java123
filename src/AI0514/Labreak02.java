package AI0514;

import java.util.Random;
import java.util.Scanner;

public class Labreak02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int num = 0;
        int computNum = 0;
        Random random = new Random();

                while (true) {
                    computNum = random.nextInt(5) + 1;
                    System.out.print("게임 " + i + "회: 컴퓨터가 생각한 숫자는 무엇일까요?");
                    num = s.nextInt();
                    if (computNum == num) {
                        System.out.println("축하합니다. 맞추셨습니다.");
                        break;
                    }

                    System.out.println("아까워요." + computNum + "였는데 다시 도전해보세요.");
                    i++;
                }
        System.out.println("게임을 마칩니다.");
                s.close();
    }
}
