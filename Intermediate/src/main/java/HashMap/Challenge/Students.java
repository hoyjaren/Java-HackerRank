package HashMap.Challenge;

public class Students {
    private String firstName, lastName;
    private String section, course;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String firstName, String lastName, String section, String course, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.course = course;
        this.age = age;
    }

    void displayStudents(){
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Course/Section: " + course + "-" +section);
        System.out.println("Age: " + age);
    }
}
