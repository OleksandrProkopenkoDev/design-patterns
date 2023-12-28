package ua.spro.designpatternsdemo.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Student originalStudent = new Student("John Doe", 33);
        Student clonedStudent = originalStudent.clone();
        System.out.println(originalStudent);
        System.out.println(clonedStudent);
    }
}
