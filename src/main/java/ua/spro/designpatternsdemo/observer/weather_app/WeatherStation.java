package ua.spro.designpatternsdemo.observer.weather_app;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature));
    }

    public void setTemperatureAndNotify(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
