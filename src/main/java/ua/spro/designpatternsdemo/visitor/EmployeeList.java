package ua.spro.designpatternsdemo.visitor;
//object structure
public class EmployeeList {

    private final Employee[] employees;

    public EmployeeList(Employee... employees){
        this.employees = employees;
    }

    public void accept(Visitor visitor){
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
