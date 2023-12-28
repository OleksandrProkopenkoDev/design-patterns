package ua.spro.designpatternsdemo.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso);

        Coffee milkEspresso = new MilkDecorator(new Espresso());
        System.out.println(milkEspresso);
    }
}
