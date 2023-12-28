package ua.spro.designpatternsdemo.flyweight.tree_example;

import lombok.ToString;

@ToString
public class PineTree implements Tree{
    @Override
    public void display(int x, int y) {
        System.out.println("Pine tree is planted at coordinates (" + x + ", " + y + ")");
    }
}
