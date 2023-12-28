package ua.spro.designpatternsdemo.visitor.computer_system.parts;

import ua.spro.designpatternsdemo.visitor.computer_system.visitors.ComputerPartVisitor;

//Element interface
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);

    String getModel();
}
