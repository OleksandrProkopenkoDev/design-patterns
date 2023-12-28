package ua.spro.designpatternsdemo.state.my_solution;

import ua.spro.designpatternsdemo.state.my_solution.tools.BrushTool;
import ua.spro.designpatternsdemo.state.my_solution.tools.EraserTool;
import ua.spro.designpatternsdemo.state.my_solution.tools.SelectionTool;
import ua.spro.designpatternsdemo.state.my_solution.tools.Tool;

public class Main {
    public static void main(String[] args) {
        Tool brush = new BrushTool();
        Tool eraser = new EraserTool();
        Tool selection = new SelectionTool();

        Canvas canvas = new Canvas(brush);
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();

        canvas.setTool(eraser);
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();

        canvas.setTool(selection);
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();
    }
}
