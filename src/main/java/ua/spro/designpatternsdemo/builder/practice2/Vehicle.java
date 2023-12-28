package ua.spro.designpatternsdemo.builder.practice2;

import lombok.Getter;

@Getter
public class Vehicle {
    private String engine;
    private int wheels;
    private int airbags;

    private Vehicle(){}

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", airbags=" + airbags +
                '}';
    }

    public static class Builder{

        private final Vehicle vehicle = new Vehicle();

        public Builder engine(String engine){
            vehicle.engine = engine;
            return this;
        }

        public Builder wheels(int wheels){
            vehicle.wheels = wheels;
            return this;
        }

        public Builder airbags(int airbags){
            vehicle.airbags = airbags;
            return this;
        }

        public Vehicle build(){
            return vehicle;
        }
    }
}
