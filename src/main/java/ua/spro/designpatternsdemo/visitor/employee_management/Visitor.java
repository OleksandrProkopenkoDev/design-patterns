package ua.spro.designpatternsdemo.visitor.employee_management;

// Visitor interface
public interface Visitor {
    void visit(Manager manager);
    void visit(Engineer engineer);
}
