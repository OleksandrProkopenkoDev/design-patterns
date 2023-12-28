package ua.spro.designpatternsdemo.visitor.computer_system.visitors;

import ua.spro.designpatternsdemo.visitor.computer_system.parts.Keyboard;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Monitor;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Mouse;

//visitor interface
public interface ComputerPartVisitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
