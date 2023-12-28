package ua.spro.designpatternsdemo.visitor;

// Visitor interface
public interface Visitor {
    void visit(Manager manager);
    void visit(Engineer engineer);
}
