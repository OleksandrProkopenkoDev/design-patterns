package ua.spro.designpatternsdemo.state.my_solution.tools;

public class EraserTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("eraser icon");
    }

    @Override
    public void onMouseDown() {
        System.out.println("Erase something");
    }
}
