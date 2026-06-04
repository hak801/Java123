package AI0528.access;

public class Rabbit {
    public static int count = 0;

    public String shape;
    public int x;
    public int y;

    public Rabbit() {
        count++;
    }

    public void moveLeftTen() {
        x -= 10;
    }

    public void moveRightTen() {   // ← 추가
        x += 10;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public void printInfo(){
        System.out.printf("%s 모양의 토끼는 (%d, %d)좌표에 있음.\n", shape, x, y);
    }
}