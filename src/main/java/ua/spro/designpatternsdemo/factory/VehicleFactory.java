package ua.spro.designpatternsdemo.factory;

import ua.spro.designpatternsdemo.factory.vehicles.Bike;
import ua.spro.designpatternsdemo.factory.vehicles.Car;
import ua.spro.designpatternsdemo.factory.vehicles.Vehicle;

import static java.lang.String.format;

public class VehicleFactory {
    public static Vehicle getBike(){
        return new Bike(2);
    }

    public static Vehicle getCar(){
        return new Car(4);
    }

    public static Vehicle getVehicle(String type, int wheels){
        if(type.equalsIgnoreCase("car")){
            return new Car(wheels);
        }
        if(type.equalsIgnoreCase("bike")){
            return new Bike(wheels);
        }
        throw new RuntimeException(format("No such vehicle type [%s]", type));
    }
}
