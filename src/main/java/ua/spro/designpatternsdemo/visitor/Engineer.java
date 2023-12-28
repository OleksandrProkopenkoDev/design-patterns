package ua.spro.designpatternsdemo.visitor;

public class Engineer implements Employee{

    private final String name;

    public Engineer(String name) {
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
