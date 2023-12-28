package ua.spro.designpatternsdemo.builder;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.builder()
                .wheels(4)
                .airbags(6)
                .engine("V6")
                .build();
        System.out.println(vehicle);
    }
}
