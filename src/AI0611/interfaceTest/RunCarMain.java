package AI0611.interfaceTest;

public class RunCarMain {
    public static void main(String[] args) {
        //인터페이스는 new 연산자로 객체 생성이 불가능
        //Car car = new Car();
        Sportage sportage = new Sportage();
        System.out.println(Car.PRODUCT);
        System.out.println(Car.ADDRESS);
        sportage.start();
        sportage.upSpeed(50);
        sportage.downSpeed(10);
        sportage.rotate("우");
        sportage.stop();
    }
}
