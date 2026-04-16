package AI0326;

import java.util.Scanner;

public class BMITest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("몸무게를 입력하세요.(kg):");
        System.out.println("키를 입력하세요.(cm):");

        double weigth = s.nextInt();
        double heigth = s.nextInt();

        System.out.println("당신의 몸무게는"+ weigth +"kg입니다.");
        System.out.println("당신의 키는"+ heigth +"cm입니다.");

        double BMI = weigth / Math.pow(heigth/100, 2);

        System.out.printf("당신의 BMI지수는 %.2f입니다.", BMI);
        s.close();
    }
}