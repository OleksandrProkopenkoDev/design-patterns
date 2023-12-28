package ua.spro.designpatternsdemo.visitor.employee_management;

public class PayrollProcessingExample {
    public static void main(String[] args) {
        Visitor payrollVisitor = new PayrollVisitor();

        Employee manager = new Manager("John Doe", 5000, 2000);
        Employee engineer = new Engineer("Alice Smith", 4000, 500);

        EmployeeList employeeList = new EmployeeList(manager, engineer);
        employeeList.accept(payrollVisitor);
    }
}
