package ua.spro.designpatternsdemo.bridge.shapes;

public class RasterRenderer implements Renderer{
    @Override
    public void render() {
        System.out.println("Rendering shape as raster");
    }
}
