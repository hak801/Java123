package AI0604.inheritance;

import AI0528.access.Rabbit;

public class MountainRabbit extends Rabbit {
    String mountainName;

    public void eatGrass(String grassType){
        System.out.println(mountainName + "에서 산토끼가 " + grassType + "먹는다.");
    }
}
