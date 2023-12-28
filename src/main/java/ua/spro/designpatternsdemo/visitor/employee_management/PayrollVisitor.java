package ua.spro.designpatternsdemo.visitor.employee_management;

// Concrete Visitor
public class PayrollVisitor implements Visitor{
    @Override
    public void visit(Manager manager) {
        double managerSalary = manager.getBaseSalary() + manager.getBonus();
        System.out.println("Processing payroll for Manager: " + manager.getName() +
                ". Total salary : " + managerSalary);
    }

    @Override
    public void visit(Engineer engineer) {
        double engineerSalary = engineer.getBaseSalary() + engineer.getOvertimePay();
        System.out.println("Processing payroll for Engineer: " + engineer.getName() +
                ". total salary: " + engineerSalary);
    }
}
