package ua.spro.designpatternsdemo.visitor.computer_system;

//visitor interface
public interface ComputerPartVisitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
