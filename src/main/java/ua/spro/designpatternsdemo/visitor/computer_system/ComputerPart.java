package ua.spro.designpatternsdemo.visitor.computer_system;
//Element interface
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);

    String getModel();
}
