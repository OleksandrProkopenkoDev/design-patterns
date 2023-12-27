package ua.spro.designpatternsdemo.memento;

import java.util.Stack;

public class Editor {
    private final Stack<String> content = new Stack<>();

    public void undo() {
        if(!content.empty()) {
            content.pop();
        }
    }

    public String getContent() {
        if(content.empty()){
            return "";
        }
        return this.content.peek();
    }

    public void setContent(String content) {
        this.content.push(content);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content=" + content +
                '}';
    }
}
