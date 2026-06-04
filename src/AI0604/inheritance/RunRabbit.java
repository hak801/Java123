package AI0604.inheritance;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30, 50);
        hr1.moveRightTen();
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("아주 좋은");

        MountainRabbit mr1 = new MountainRabbit();
        mr1.shape = "세모";
        mr1.moveLeftTen();
        mr1.moveLeftTen();
        mr1.printInfo();
        mr1.mountainName = " 에베레스트";
        mr1.eatGrass("건조한 풀을 ");
    }


}
