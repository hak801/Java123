package AI0604;

import AI0528.access.Rabbit;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println("count 클래스 변수(공유)의 초기값: " + Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.println("count 클래스 변수(공유)의 초기값: " +Rabbit.count);

        Rabbit r2 = new Rabbit();
        System.out.println("count 클래스 변수(공유)의 초기값: " +Rabbit.count);
    }
}
