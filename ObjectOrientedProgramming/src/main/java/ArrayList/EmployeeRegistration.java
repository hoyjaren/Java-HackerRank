package ArrayList;
import java.util.*;
public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "Yes";

        //ArrayList
        ArrayList<Employee> employee = new ArrayList<Employee>();

        do{
            System.out.print("Enter Firstname: ");
            String firstName = input.nextLine();
            System.out.print("Enter Lastname: ");
            String lastName = input.nextLine();
            System.out.print("Enter Birthday: ");
            String birthDate = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Position: ");
            String position = input.nextLine();

            //Add data to arraylist
            employee.add(new Employee(firstName, lastName, birthDate, position, age));

            //Condition to continue or not
            System.out.println("Do you want to add more? Yes or No ");
            choice = input.nextLine();
        }while (choice.equalsIgnoreCase("Yes"));
            System.out.println("-----------------------------------------------");
            System.out.println("List of Employee\n");
            System.out.println("-----------------------------------------------");
            //show employee data
            for (int i = 0; i < employee.size(); i++){
                System.out.println("Employee # "+(i + 1));
                employee.get(i).showData();
                System.out.println();
        }
        input.close();

    }
}
