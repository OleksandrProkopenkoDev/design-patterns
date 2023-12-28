package ua.spro.designpatternsdemo.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Cloneable {
    private String name;
    private int age;

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.name = this.name;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
