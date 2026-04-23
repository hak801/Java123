package AI0423;

import java.util.Scanner;

public class BMItest02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요.(kg):");
        double weigth = s.nextInt();

        System.out.print("키를 입력하세요.(cm):");
        double heigth = s.nextInt();

        System.out.print("성명 입력:");
        String name = s1.nextLine();

        System.out.print("당신의 몸무게는"+ weigth +"kg입니다.");
        System.out.print("당신의 키는"+ heigth +"cm입니다.");

        double BMI = weigth / Math.pow(heigth/100, 2);
        String result1, result2;

        if(BMI < 18.5){
            result1 = "저";
            result2 = "식단과 운동을 통해 체중을 증량시켜야합니다. 생명에 위협이 있을 수도 있습니다.";
        }else if(BMI < 22.9){
            result1 = "정상";
            result2 = "현재 체중을 유지하세요.";
        }else if(BMI < 24.9) {
            result1 = "과";
            result2 = "식단과 운동을 통해 체중을 감소시켜야합니다. 생명에 위협이 있을 수도 있습니다.";
        }else if(BMI < 29.9) {
            result1 = "비만";
            result2 = "살빼세요.";
        }else{
            result1 = "고도비만";
            result2 = "전문가의 도움을 받아 식단과 운동을 통해 반드시 살빼라";
        }
        System.out.printf(" %s님의 BMI지수 결과: %.2fkg/㎡이므로 %s체중입니다.\n",name, BMI, result1);
        System.out.printf("%s체중은 %s", result1, result2);

        s.close();
        s1.close();
    }
}