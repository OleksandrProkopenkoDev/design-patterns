package ua.spro.designpatternsdemo.visitor.computer_system;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Keyboard implements ComputerPart{

    private String model;

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getModel() {
        return model;
    }
}
