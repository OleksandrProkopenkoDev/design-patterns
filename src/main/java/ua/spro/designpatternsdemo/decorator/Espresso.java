package ua.spro.designpatternsdemo.decorator;

import lombok.ToString;

public class Espresso implements Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String toString() {
        return "Espresso{Description: "+getDescription()+
                ", cost: " + getCost() +
                "}";
    }
}
