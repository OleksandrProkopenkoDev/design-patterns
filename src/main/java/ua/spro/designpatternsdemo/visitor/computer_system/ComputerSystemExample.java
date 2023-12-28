package ua.spro.designpatternsdemo.visitor.computer_system;

import ua.spro.designpatternsdemo.visitor.computer_system.parts.ComputerPart;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Keyboard;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Monitor;
import ua.spro.designpatternsdemo.visitor.computer_system.parts.Mouse;
import ua.spro.designpatternsdemo.visitor.computer_system.visitors.ComputerPartVisitor;
import ua.spro.designpatternsdemo.visitor.computer_system.visitors.DiagnosticsVisitor;
import ua.spro.designpatternsdemo.visitor.computer_system.visitors.UpgradeVisitor;

public class ComputerSystemExample {
    public static void main(String[] args) {
        ComputerPartVisitor upgradeVisitor = new UpgradeVisitor();
        ComputerPartVisitor diagnosticsVisitor = new DiagnosticsVisitor();


        ComputerPart mouse = new Mouse("Logitech G502");
        ComputerPart keyboard = new Keyboard("Corsair k95 RGB");
        ComputerPart monitor = new Monitor("Dell Ultrasharp U2719D");

        ComputerSystem computerSystem = new ComputerSystem(monitor, mouse, keyboard);

        computerSystem.accept(upgradeVisitor);

        computerSystem.accept(diagnosticsVisitor);
    }
}
