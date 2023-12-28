package ua.spro.designpatternsdemo.observer.warehouse;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject{

    private final List<Observer> observers;
    private String location;

    public DeliveryData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(location));
    }

    public void locationChanged(String location){
        this.location = location;
        notifyObservers();
    }
}
