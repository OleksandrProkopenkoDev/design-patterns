package ua.spro.designpatternsdemo.builder.practice2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.builder()
                .wheels(4)
                .build();
        System.out.println(vehicle);
    }
}
