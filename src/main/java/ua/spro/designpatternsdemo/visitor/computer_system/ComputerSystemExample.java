package ua.spro.designpatternsdemo.visitor.computer_system;

public class ComputerSystemExample {
    public static void main(String[] args) {
        ComputerPartVisitor upgradeVisitor = new UpgradeVisitor();

        ComputerPart mouse = new Mouse("Logitech G502");
        ComputerPart keyboard = new Keyboard("Corsair k95 RGB");
        ComputerPart monitor = new Monitor("Dell Ultrasharp U2719D");

        ComputerSystem computerSystem = new ComputerSystem(monitor, mouse, keyboard);
        computerSystem.accept(upgradeVisitor);
    }
}
