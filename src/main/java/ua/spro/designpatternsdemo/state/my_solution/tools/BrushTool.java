package ua.spro.designpatternsdemo.state.my_solution.tools;

public class BrushTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("brush icon");
    }

    @Override
    public void onMouseDown() {
        System.out.println("draw rectangle with brush");
    }
}
