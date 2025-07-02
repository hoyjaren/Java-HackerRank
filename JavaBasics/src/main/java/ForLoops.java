import java.util.*;
public class ForLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"David", "Alenere", "Jasfer", "Emman", "Mark", "Jaren"};

        for(int i = 0; i < names.length; i++){
            System.out.println("Ako si " + names[i]);
        }

        //Conditions in FOR Loop
        boolean found = false;
        System.out.println("Enter Name to find: ");
        String name = input.nextLine();

        for(int i = 0; i<names.length; i++){

            if (names[i].equalsIgnoreCase(name)){
                System.out.println("We Found " + names[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Not Found");
        }

        /*CHALLENGE
        * Authentication Simulation
        * Create a program that has 2 sets of arrays w/ values already one for
        * the username and one for the password, the username and password paired
        * by index, Let the user input a username and password then check if the
        * account exists on the 2 sets of arrays.
        *
        * if the username and password doesnt match then display
        * "Account not Found"
        *
        * if the username and password matches then display "Welcome,
        * {Username}"
        * */

        boolean exist = false;

        String[] userName = {"Ja", "Chawon", "Skip", "Apelpisia"};
        String[] password = {"123", "321", "abc", "efg"};

        System.out.println("Enter Username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String pass = input.nextLine();

        for(int i = 0; i < userName.length; i++){
            if(username.equalsIgnoreCase(userName[i]) && pass.equalsIgnoreCase(password[i])){
                System.out.println("Welcome " + userName[i]);
                exist = true;
                break;
            }
        }
        if (!exist){
            System.out.println("Account Not Found");
        }


    }
}
