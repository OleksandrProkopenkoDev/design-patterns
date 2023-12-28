package ua.spro.designpatternsdemo.visitor.employee_management;

import lombok.Getter;

//concrete Manager
@Getter
public class Manager implements Employee{

    private final String name;
    private final double baseSalary;
    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
