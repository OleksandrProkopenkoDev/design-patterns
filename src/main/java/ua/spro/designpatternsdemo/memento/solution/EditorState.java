package ua.spro.designpatternsdemo.memento.solution;

import lombok.Getter;
import lombok.Setter;

@Getter
public class EditorState {

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }
}
