package AI0611.subcar;


import AI0611.lab.car.Car;

public class sportCar extends Car {
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 200){
            this.speed = 200;
        }
    }
}
