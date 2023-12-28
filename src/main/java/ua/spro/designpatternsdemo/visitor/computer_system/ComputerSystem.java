package ua.spro.designpatternsdemo.visitor.computer_system;

import ua.spro.designpatternsdemo.visitor.computer_system.parts.ComputerPart;
import ua.spro.designpatternsdemo.visitor.computer_system.visitors.ComputerPartVisitor;

public class ComputerSystem {
    private final ComputerPart[] parts;

    public ComputerSystem(ComputerPart... parts){
        this.parts = parts;
    }

    public void accept(ComputerPartVisitor visitor){
        for (ComputerPart part: parts){
            part.accept(visitor);
        }
    }
}
