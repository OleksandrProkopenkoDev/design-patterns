package ua.spro.designpatternsdemo.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
    }
}
