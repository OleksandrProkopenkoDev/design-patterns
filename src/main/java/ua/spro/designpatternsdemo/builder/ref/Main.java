package ua.spro.designpatternsdemo.builder.ref;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .age(23)
                .group("sd-22")
                .name("Jo")
                .build();
    }
}
