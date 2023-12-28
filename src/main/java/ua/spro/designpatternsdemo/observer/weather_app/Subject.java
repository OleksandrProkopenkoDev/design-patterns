package ua.spro.designpatternsdemo.observer.weather_app;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
