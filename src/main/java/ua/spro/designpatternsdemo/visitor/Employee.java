package ua.spro.designpatternsdemo.visitor;
// Element interface
public interface Employee {

    void accept(Visitor visitor);
    String getName();
}
