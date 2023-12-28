package ua.spro.designpatternsdemo.bridge.shapes;

public class DrawingApp {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle1 = new Circle(vectorRenderer);
        circle1.draw();

        Shape circle2 = new Circle(rasterRenderer);
        circle2.draw();
    }
}
