package ua.spro.designpatternsdemo.factory.vehicles;

public abstract class Vehicle {

    public abstract int getWheel();

    public String toString() {
        return "Wheels: " + this.getWheel();
    }
}
