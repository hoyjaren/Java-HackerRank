package ExceptionHandling;
import java.util.*;
public class Challenge {
    public static void main(String[] args) {

        /*Challenge
        * Create a program that lets the user input an integer
        * make sure that it is an integer.
        *
        * prompt the user again for an integer if an
        * InputMismatchException occurs.
        *
        * Output the square of the inputted integer.*/

        Scanner input = new Scanner(System.in);
        int num = 0 ;

        do {
            try{
                System.out.println("Enter Number: ");
                num = input.nextInt();

                if (num != 0){
                    System.out.println("Result: " + num * num);
                    break;
                }

            }catch (InputMismatchException e){
                System.out.println();
                System.out.println("Invalid Input! Please enter an integer. ");
                input.next();
                continue;
            }

        }while (true);

    }
}
