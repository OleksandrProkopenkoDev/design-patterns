package ua.spro.designpatternsdemo.composite;

public interface FileSystemComponent {
    void display();
    void addComponent(FileSystemComponent component);
    void removeComponent(FileSystemComponent component);
}
