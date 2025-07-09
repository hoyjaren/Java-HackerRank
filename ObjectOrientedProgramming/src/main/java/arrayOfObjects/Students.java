package arrayOfObjects;

public class Students {
    private String firstName, lastName;
    private int year;
    private String course, section;

    public Students(String firstName, String lastName, int year, String course, String section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    void displayStudents(){
        System.out.println("Firstname : " + firstName);
        System.out.println("Lastname  : " + lastName);
        System.out.println("Year      : " + year);
        System.out.println("Course    : " + course);
        System.out.println("Section   : " + section);

    }


}
