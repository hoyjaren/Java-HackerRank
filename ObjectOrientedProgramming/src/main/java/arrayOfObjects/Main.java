package arrayOfObjects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee[] = new Employee[2];

        //Accessing
        //System.out.println(employee[0].firstName);
        //employee[0].introduceSelf();

        for(int i = 0; i < employee.length; i++){
            System.out.println("Enter firstname: ");
            String firstName = input.nextLine();
            System.out.println("Enter lastname: ");
            String lastName = input.nextLine();
            System.out.println("Job Title: ");
            String jobTitle = input.nextLine();

            //Storing objects inside array
            employee[i] = new Employee(firstName, lastName, jobTitle);
        }
        System.out.println();

        for(int i = 0; i < employee.length; i++){
            System.out.print((i + 1) + ".");
            employee[i].introduceSelf();

        }


    }
}
