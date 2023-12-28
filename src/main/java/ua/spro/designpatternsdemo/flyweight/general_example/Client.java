package ua.spro.designpatternsdemo.flyweight.general_example;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("A");
        Flyweight flyweight2 = factory.getFlyweight("b");

        flyweight1.operation();
        flyweight2.operation();
    }
}
