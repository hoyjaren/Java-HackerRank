package ArrayList;

public class Student {
    String name, course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    void introduce(){
        System.out.println("I am " + name);
        System.out.println("from " + course);
    }
}
