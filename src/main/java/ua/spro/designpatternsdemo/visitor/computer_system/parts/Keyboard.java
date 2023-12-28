package ua.spro.designpatternsdemo.visitor.computer_system.parts;

import lombok.AllArgsConstructor;
import ua.spro.designpatternsdemo.visitor.computer_system.visitors.ComputerPartVisitor;

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
