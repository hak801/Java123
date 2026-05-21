package AI0521.rabbit;

class rabbit {
    private String shape; // 토끼의 모양
    private int xPos; // X의 위치
    private int yPos; // Y의 위치

    void setPosition(int x, int y) {
        int xPos;
        int yPos;
    }

    public rabbit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

}