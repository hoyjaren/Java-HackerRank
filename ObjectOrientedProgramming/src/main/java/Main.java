import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Persons p = new Persons();

        //Accessing Attributes
        p.firstName = "Jaren";
        p.lastName = "Tabs";
        p.sex = 'M';
        p.age = 22;

        Persons p1 = new Persons();

        //Accessing Attributes
        p1.firstName = "Chawon";
        p1.lastName = "Tabs";
        p1.sex = 'F';
        p1.age = 22;

        System.out.println(p.firstName);
        System.out.println(p1.firstName);

        Persons p3 = new Persons();

        System.out.print("Enter First Name: ");
        p3.firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        p3.lastName = input.nextLine();
        System.out.print("Enter Gender: ");
        p3.sex = input.next().charAt(0);
        System.out.print("Enter Age: ");
        p3.age = input.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("FirstName: " + p3.firstName.toUpperCase());
        System.out.println("LastName:  " + p3.lastName.toUpperCase());
        System.out.println("Gender:    " + p3.sex);
        System.out.println("Age:       " + p3.age);

    }
}
