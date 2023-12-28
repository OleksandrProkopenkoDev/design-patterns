package ua.spro.designpatternsdemo.observer.warehouse;


public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
