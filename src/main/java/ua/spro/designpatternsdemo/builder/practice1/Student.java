package ua.spro.designpatternsdemo.builder.practice1;


public class Student {
    private String name;
    private int age;
    private String group;

    private Student(){}

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    public static class Builder{

        private final Student student = new Student();

        public Builder name(String name){
            student.name = name;
            return this;
        }

        public Builder age(int age){
            student.age = age;
            return this;
        }

        public Builder group(String group){
            student.group = group;
            return this;
        }

        public Student build(){
            return student;
        }
    }
}
