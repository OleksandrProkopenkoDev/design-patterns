package ua.spro.designpatternsdemo.visitor;

// Concrete Visitor
public class PayrollVisitor implements Visitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("Processing payroll for Manager: " + manager.getName());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("Processing payroll for Engineer: " + engineer.getName());
    }
}
