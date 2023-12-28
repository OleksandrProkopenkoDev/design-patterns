package ua.spro.designpatternsdemo.factory.vehicles;

public class Bike extends Vehicle{

    private final int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "wheel=" + wheel +
                '}';
    }
}
