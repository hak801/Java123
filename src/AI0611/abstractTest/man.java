package AI0611.abstractTest;

public class man extends Person {
    // 추상 클래스를 상속 받으려면
    // - 추상 메소드를 구현하거나 현재 클래스가 추상 클래스이던지
    @Override
    public void study() {
        System.out.println("아들이 공부를 열심히 한다.");
    }
}
