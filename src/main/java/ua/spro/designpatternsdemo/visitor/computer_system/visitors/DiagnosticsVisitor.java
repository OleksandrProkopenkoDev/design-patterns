package ua.spro.designpatternsdemo.visitor.computer_system.visitors;

import ua.spro.designpatternsdemo.visitor.computer_system.parts.Keyboard;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Monitor;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Mouse;

public class DiagnosticsVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Running diagnostics for mouse: " + mouse.getModel());
        // Simulate diagnostic checks...
        System.out.println("Mouse diagnostics complete. Health status: OK");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Running diagnostics for keyboard: " + keyboard.getModel());
        // Simulate diagnostic checks...
        System.out.println("Keyboard diagnostics complete. Health status: OK");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Running diagnostics for monitor: " + monitor.getModel());
        // Simulate diagnostic checks...
        System.out.println("Monitor diagnostics complete. Health status: OK");
    }
}
