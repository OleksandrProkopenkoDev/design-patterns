package ua.spro.designpatternsdemo.observer.weather_app;

public class CarDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Car Display: current Temperature is " + temperature);
    }
}
