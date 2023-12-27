package ua.spro.designpatternsdemo.state.my_solution.tools;

public class SelectionTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void onMouseDown() {
        System.out.println("Select something");
    }
}
