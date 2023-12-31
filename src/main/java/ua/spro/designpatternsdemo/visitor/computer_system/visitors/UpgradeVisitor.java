package ua.spro.designpatternsdemo.visitor.computer_system.visitors;

import ua.spro.designpatternsdemo.visitor.computer_system.parts.Keyboard;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Monitor;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Mouse;

//concrete visitor
public class UpgradeVisitor implements ComputerPartVisitor{


    @Override
    public void visit(Mouse mouse) {
        System.out.println("Upgrading mouse: " + mouse.getModel());
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Upgrading keyboard: " + keyboard.getModel());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Upgrading monitor: " + monitor.getModel());
    }
}
