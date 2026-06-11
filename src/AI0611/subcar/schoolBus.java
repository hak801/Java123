package AI0611.subcar;


import AI0611.lab.car.Car;

public class schoolBus extends Car {
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 60){
            this.speed = 60;
        }
    }


}
