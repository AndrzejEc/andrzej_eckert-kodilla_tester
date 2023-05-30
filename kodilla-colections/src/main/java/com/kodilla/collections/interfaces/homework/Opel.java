package interfaces.homework;

public class Opel implements Car{
    private int speed = 0;
    private int acceleration = 15;
    private int braking = 10;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + acceleration;
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed - braking > 0) {this.speed = this.speed - braking;}
        else {speed = 0;}
    }
}
