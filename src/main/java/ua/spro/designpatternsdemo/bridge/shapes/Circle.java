package ua.spro.designpatternsdemo.bridge.shapes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape{

    private Renderer renderer;

    @Override
    public void draw() {
        renderer.render();
        System.out.println("drawing a circle");
    }
}
