import java.util.*;
public class Objects {
    public static void main(String[] args) {
        /*
        Character c = new Character("Skip", "Hello, There", 100, 50, 5);
        Character c1 = new Character("Chawon", "Hi There", 100, 50, 5);
        System.out.println(c.dialog);

        c.introduce();
        c.sayDialog();
        c1.sayDialog();
        c1.talkTo(c);
         */

       /*CHALLENGE
       * Student Object Simulation
       * Create a class student that has the attributes
       * firstNam, lastName, year, course, section, midtermGrade, finalGrade
       *
       * Create a Constructor for the class.
       * Create the following Object Methods.
       * introduceSelf()
       * Outputs the FullName, Course, Year and Section of the Student
       *
       * evaluateGrade()
       * Average the midterm and finalGrade output their average
       * and their standing if they are an honor, passed or failed
       * */

        String firstName, lastName, course, section;
        int year;
        float midtermGrade, finalGrade;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Firstname: " );
        firstName = input.nextLine();
        System.out.print("Enter Lastname: ");
        lastName = input.nextLine();
        System.out.print("Course: ");
        course = input.nextLine();
        System.out.print("Section: ");
        section = input.nextLine();
        System.out.print("Year: ");
        year = input.nextInt();
        System.out.print("Midterm Grade: ");
        midtermGrade = input.nextFloat();
        System.out.print("Final Grade: ");
        finalGrade = input.nextFloat();

        Student s = new Student(firstName, lastName, course, section, year, midtermGrade, finalGrade);
        s.introduceSelf();
        s.evaluateGrade();
    }
}
