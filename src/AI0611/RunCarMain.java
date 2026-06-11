package AI0611;


import AI0611.subcar.schoolBus;
import AI0611.subcar.sportCar;

import java.util.Scanner;


public class RunCarMain {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int speed = 0;

        sportCar sportCar = new sportCar();
        schoolBus schoolBus = new schoolBus();

        while (true) {
            System.out.print("가속할 속도 입력(종료는 -1 입력):");
            speed = s1.nextInt();

            if(speed == -1)
                break;

            sportCar.upSpeed(speed);
            schoolBus.upSpeed(speed);

            System.out.printf("스쿨버스의 현재 속도:%d\n", schoolBus.getSpeed());
            System.out.printf("스포츠카의 현재 속도: %d\n", sportCar.getSpeed());
        }
        s1.close();
    }
}
