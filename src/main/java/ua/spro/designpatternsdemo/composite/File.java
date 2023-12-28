package ua.spro.designpatternsdemo.composite;

public class File implements FileSystemComponent{

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("file: " + name);
    }

    @Override
    public void addComponent(FileSystemComponent component) {
        // Since File is a leaf, this operation doesn't apply.
        throw new UnsupportedOperationException("addComponent is not supported for File");
    }

    @Override
    public void removeComponent(FileSystemComponent component) {
        // Since File is a leaf, this operation doesn't apply.
        throw new UnsupportedOperationException("removeComponent is not supported for File");
    }
}
