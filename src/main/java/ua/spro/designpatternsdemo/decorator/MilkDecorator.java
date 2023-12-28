package ua.spro.designpatternsdemo.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String toString() {
        return "addMilk {Description: "+getDescription()+
                ", cost: " + getCost() +
                "}";
    }
}
