package ua.spro.designpatternsdemo.visitor.computer_system;

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
