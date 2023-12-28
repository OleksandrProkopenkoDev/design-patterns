package ua.spro.designpatternsdemo.visitor;

import lombok.Getter;

@Getter
public class Engineer implements Employee{

    private final String name;
    private final double baseSalary;
    private final double overtimePay;

    public Engineer(String name, double baseSalary, double overtimePay) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
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
