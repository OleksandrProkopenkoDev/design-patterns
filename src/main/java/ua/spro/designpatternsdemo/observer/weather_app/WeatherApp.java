package ua.spro.designpatternsdemo.observer.weather_app;

public class WeatherApp {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        CarDisplay carDisplay = new CarDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(carDisplay);

        weatherStation.setTemperatureAndNotify(25);
        Thread.sleep(1000);
        weatherStation.setTemperatureAndNotify(24);
        Thread.sleep(1000);
        weatherStation.setTemperatureAndNotify(23);
    }
}
