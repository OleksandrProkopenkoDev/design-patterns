package ua.spro.designpatternsdemo.flyweight.general_example;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteFlyweight implements Flyweight{

    private String intrinsicState;

    @Override
    public void operation() {
        System.out.println("Concrete Flyweight: " + intrinsicState);
    }
}
