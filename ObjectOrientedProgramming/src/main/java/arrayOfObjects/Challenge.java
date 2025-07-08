package arrayOfObjects;
import java.util.*;
public class Challenge {
    public static void main(String[] args) {
        /*Challenge
        * Student Registration Simulation
        * Make the user input the number of students to be registered
        * Make the user input the credentials of the students
        * firstname, lastname, year, section, course*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter students to be registered: ");
        int registered = input.nextInt();
        input.nextLine();//consume leftover

        Students students[] = new Students[registered];

        for (int i = 0; i < registered; i++){

            System.out.print("Enter Firstname : ");
            String firstName = input.nextLine();
            System.out.print("Enter Lastname : ");
            String lastName = input.nextLine();
            System.out.print("Year : ");
            int year = input.nextInt();
            input.nextLine();//consume leftover
            System.out.print("Course : ");
            String course = input.nextLine();
            System.out.print("Section : ");
            String section = input.nextLine();

            students[i] = new Students(firstName, lastName, year, course, section);
            System.out.println("------------------------------------------------------");
        }
        System.out.println();

        for(int i = 0; i < students.length; i++){
            System.out.println((i + 1) + ".");
            students[i].displayStudents();
            System.out.println();
        }
    }
}
