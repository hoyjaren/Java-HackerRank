import java.util.*;

public class InputAndArithmeticOperators {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        /*
        System.out.print("Enter Name: ");
        String x = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();

        //Print the value of x
        System.out.println(x);
        System.out.println(age);

        age = 23;
        System.out.println(age);
        */
        //ARITHMETIC OPERATORS

        //MODULUS %
        int b = 5;
        int y = 2;

        //int remainder = b % y; //Getting the remainder of this 5 / 2 = 2 remainder 1
        System.out.println((b/y) + "remainder" + (b%y));

        //INCREMENT
        //POST INCREMENT
        int a = 5;
        int c = a++;// c = 5; c becomes 6

        //PRE INCREMENT
        int e = 5;
        int t = ++e;//b becomes 6; x = 6

        System.out.println(b++);//prints b, then increments
        System.out.println(++b);//increments b, then prints

        System.out.println("============================================================");
        //CHALLENGE
        /*ONE FUNCTION CALCULATOR
        *Create a Program that will make the User Input the 2
        *Numbers and perform one of the arithmetic operators
        *excluding increment and decrement
        * */

        System.out.print("Enter Number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = input.nextInt();

        System.out.println("Num1: " + num1);
        System.out.println("Num2: "+ num2);
        int result = num1 * num2;
        System.out.println("Result: "+ num1 + " x " + num2 + " = " + result);

    }
}
