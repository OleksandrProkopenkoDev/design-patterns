package ua.spro.designpatternsdemo.visitor.employee_management;
// Element interface
public interface Employee {

    void accept(Visitor visitor);
    String getName();
}
