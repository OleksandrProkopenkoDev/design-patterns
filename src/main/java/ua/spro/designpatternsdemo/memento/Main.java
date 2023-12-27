package ua.spro.designpatternsdemo.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        editor.setContent("d");
        editor.setContent("e");
        System.out.println(editor);
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println(editor);
    }
}
