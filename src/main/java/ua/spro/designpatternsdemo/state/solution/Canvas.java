package ua.spro.designpatternsdemo.state.solution;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection icon");
        }else
        if(currentTool == ToolType.BRUSH){
            System.out.println("Brush icon");
        }else
        if(currentTool == ToolType.ERASER){
            System.out.println("eraser icon");
        }
    }

    public void mouseUp(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Draw dashed rectangle");
        }else
        if(currentTool == ToolType.BRUSH){
            System.out.println("Draw a line");
        }else
        if(currentTool == ToolType.ERASER){
            System.out.println("erase something");
        }
    }
}
