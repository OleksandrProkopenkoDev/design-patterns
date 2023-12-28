package ua.spro.designpatternsdemo.factory.vehicles;

public class Car extends Vehicle{

    private final int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                '}';
    }
}
