package ua.spro.designpatternsdemo.visitor;

public class PayrollProcessingExample {
    public static void main(String[] args) {
        Visitor payrollVisitor = new PayrollVisitor();

        Employee manager = new Manager("John Doe");
        Employee engineer = new Engineer("Alice Smith");

        EmployeeList employeeList = new EmployeeList(manager, engineer);
        employeeList.accept(payrollVisitor);
    }
}
