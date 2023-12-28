package ua.spro.designpatternsdemo.observer.warehouse;

public class WarehouseApp {
    public static void main(String[] args) throws InterruptedException {
        DeliveryData topic = new DeliveryData();

        Observer seller = new Seller();
        Observer user = new User();
        Observer center = new DeliveryWarehouseCenter();

        topic.register(seller);
        topic.register(user);
        topic.register(center);

        topic.locationChanged("Konotop");
        Thread.sleep(1000);
        topic.locationChanged("Sumy");
        Thread.sleep(1000);
        topic.locationChanged("Kyiv");
    }
}
