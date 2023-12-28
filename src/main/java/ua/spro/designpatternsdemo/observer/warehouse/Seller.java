package ua.spro.designpatternsdemo.observer.warehouse;

public class Seller implements Observer{

    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    private void showLocation() {
        System.out.println("Notification at Seller - Current location: " + location);
    }
}