package AI0528.access;

public class Rabbit {
//    private String shape;
//    private int x;
//    private int y;

    public String shape;
    public int x;
    public int y;

// default(생략) 제한자는 같은 패키지내에서만 접근이 가능

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public String getShape() {
//        return shape;
//    }
//
//    public void setShape(String shape) {
//        this.shape = shape;
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printInfo(){
        System.out.printf("%s 모양의 토끼는 (%d, %d)좌표에 있음.\n", shape,x, y);
    }
}
