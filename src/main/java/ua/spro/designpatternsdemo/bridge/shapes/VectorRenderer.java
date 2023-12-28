package ua.spro.designpatternsdemo.bridge.shapes;

public class VectorRenderer implements Renderer{
    @Override
    public void render() {
        System.out.println("Rendering shape as vector");
    }
}
