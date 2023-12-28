package ua.spro.designpatternsdemo.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        components.forEach(FileSystemComponent::display);
    }
}
