package ua.spro.designpatternsdemo.factory;

import ua.spro.designpatternsdemo.factory.vehicles.Car;
import ua.spro.designpatternsdemo.factory.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getCar();
        System.out.println(car);

        Vehicle bike = VehicleFactory.getBike();
        System.out.println(bike);

        Vehicle car2 = VehicleFactory.getVehicle("car", 4);
        System.out.println(car2);

        Vehicle bike2 = VehicleFactory.getVehicle("bike", 2);
        System.out.println(bike2);
    }
}
