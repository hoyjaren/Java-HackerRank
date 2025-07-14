package HashMap.Challenge;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        /*Tutorial Challenge
        * Create a HashMap of students, Let the user input how many students shall be created.
        * Let the user create the insert it inside the HashMap.
        *
        * Given that you have a HashMap of students. Make the user input a Student ID then
        * display the info of the student if it exist or let the user know if it does not exist.*/

        System.out.print("Enter number of student: ");
        int totalStudent = input.nextInt();

        HashMap<Integer, Students> students = new HashMap<>(totalStudent);
        int count = 0;

        System.out.println("----------------ENTER STUDENT INFORMATION--------------");
        do {
            System.out.print("Enter Student ID#: ");
            int idNum = input.nextInt();
            input.nextLine();
            System.out.print("Enter FirstName: ");
            String firstName = input.nextLine();
            System.out.print("Enter lastName: ");
            String lastName = input.nextLine();
            System.out.print("Enter Section: ");
            String section = input.nextLine();
            System.out.print("Enter Course: ");
            String course = input.nextLine();
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            input.nextLine();

            students.put(idNum, new Students(firstName, lastName, section, course, age));
            count++;

            System.out.println();

        }while (count < totalStudent);
        System.out.println();

        System.out.print("Enter Student Id to search: " );
        int studentId = input.nextInt();
        System.out.println();


        System.out.println("STUDENT INFORMATION");
        if (students.containsKey(studentId)){
            Students s = students.get(studentId);
            System.out.println("Student ID#: " + studentId);
            s.displayStudents();

        }else {
            System.out.print("Student with ID " + studentId + " Doesn't Exist!");
        }
        input.close();

    }
}
