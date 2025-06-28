import java.util.*;
public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declare with values
        String names[] = {"David", "Alenere", "Jasfer"};
        System.out.println(names[2]);
        //Reading array elements
        int numbers[] = {1,2,3,4,5};
        System.out.println(numbers[4] + numbers[0]);

        //Declare without values
        String name[] = new String[4];

        //Assigning array elements
        name[1] = "Ronald";
        names[2] = "Kyle";
        System.out.println(names[2]);

        //Array element write with user input
        System.out.print("Enter name: " );
        name[0] = input.next();
        System.out.println(name[0] + " and " + name[1] + " are friends");

        /*CHALLENGE
        * PAIRED ARRAY BY INDEX
        * Create 3 arrays that will hold 5 users credentials:
        * Email
        * Username
        * Password
        *
        * For Example: email[0], username[0], and password[0]
        * should belong to the same user
        * */

        String email[] = {"softeng@gmail.com", "javaDev@gmail.com", "softDev@gmail.com"};
        String userName[] = {"SoftEngineer", "JavaDev", "SoftDeveloper"};
        String password[] = {"eng123", "java123", "soft123"};

        int i = 0;
        System.out.println("Index:    " + i);
        System.out.println("Email:    " + email[i]);
        System.out.println("Username: " + userName[i]);
        System.out.println("Password: " + password[i]);



    }
}
