package ua.spro.designpatternsdemo.composite;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Document.txt");
        FileSystemComponent file2 = new File("Image.jpg");

        FileSystemComponent folder1 = new Folder("MyDocuments");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        FileSystemComponent file3 = new File("presentation.pptx");

        FileSystemComponent folder2 = new Folder("Projects");
        folder2.addComponent(folder1);
        folder2.addComponent(file3);

        folder2.display();
    }
}
