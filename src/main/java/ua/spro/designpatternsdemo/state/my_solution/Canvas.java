package ua.spro.designpatternsdemo.state.my_solution;

import lombok.Setter;
import ua.spro.designpatternsdemo.state.my_solution.tools.Tool;

@Setter
public class Canvas {

    private Tool tool;

    public Canvas(Tool tool) {
        this.tool = tool;
    }

    public void mouseDown() {
        tool.onMouseDown();
    }

    public void mouseUp() {
        tool.onMouseUp();
    }
}
