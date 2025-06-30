import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //IF-ELSE STATEMENT
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine(); // <-- consume leftover newline
        boolean qualified = false;

        if(age >= 18 && age <= 55){// <-- Both condition are true
            System.out.println("You have access");
            //NESTED CONDITIONAL STATEMENT
            if (qualified){
                System.out.println("You are qualified");
            }else {
                System.out.println("You are not qualified");
            }
        } else if (age >= 55) {
            System.out.println("Over Age");
        } else {
            System.out.println("Access Denied");
        }

        //EQUALS FUNCTION
        System.out.print("Enter String: ");
        String greetings = input.nextLine();

        if (greetings.equalsIgnoreCase("Kupal")){
            System.out.println("Bossing");
        }else {
            System.out.println("Boss?");
        }

        //OR CONDITIONAL STATEMENTS
        boolean hasBallpen = false;
        boolean hasPencil = false;

        if (hasBallpen || hasPencil){ // <-- Either condition is true
            System.out.println("Congrats");
        }else {
            System.out.println("failed");
        }

        /*
        CHALLENGE
        * GRADE AVERAGE PROGRAM
        * Create a program that will let the user input 4 Grades then
        * make the program compute the average and display a
        * message based on its value.
        *
        * if average:
        * Above 100 -- Invalid Grade
        * 98 to 100 -- Valedictorian
        * 95 to 97.99 -- Suma Cum Laude
        * 90 to 94.99 -- Magna Cum Laude
        * 75 to 89.99 -- Passed
        * Below 75 -- Failed
        * */

        System.out.print("Enter FOP Grade: ");
        double FOP = input.nextDouble();
        System.out.print("Enter Intermediate Prog Grade: ");
        double inteProg = input.nextDouble();
        System.out.print("Enter OOP Grade: ");
        double OOP = input.nextDouble();
        System.out.print("Ente DSA Grade: ");
        double DSA = input.nextDouble();

        double average = (FOP + inteProg + OOP + DSA)/4;
        System.out.println("Average: " + average);

        if(average > 100){
            System.out.println("Invalid Grade");
        } else if (average >= 98 && average <= 100) {
            System.out.println("Valedictorian");
        }else if (average >= 95 && average <= 97.99){
            System.out.println("Suma Cum Laude");
        }else if (average >= 90 && average <= 94.99) {
            System.out.println("Magna Cum Laude");
        }else if (average >= 75 && average <= 89.99) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }
}
