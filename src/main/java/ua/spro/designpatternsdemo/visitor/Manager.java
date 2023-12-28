package ua.spro.designpatternsdemo.visitor;
//concrete Manager
public class Manager implements Employee{

    private final String name;

    public Manager(String name) {
        this.name = name;
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
