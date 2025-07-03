import java.util.*;
public class Methods {

    //GLOBAL VARIABLE
    static String Hello1 = "Bobo";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //LOCAL VARIABLE
        String Hello = "What's Up";
        System.out.println(Hello);
        sayHello();

        System.out.println("Enter num1: ");
        int n1 = input.nextInt();
        System.out.println("Enter num2: ");
        int n2 = input.nextInt();
        sheesh(n1, n2);

        //Return type
        System.out.println(multiply(10, 11));
        //Overloading Methods
        System.out.println(multiply(10, 11, 12));

        int numero[] = {1, 3, 5, 7, 9, 11};
        System.out.println("Challenge answer is "+ summation(numero));

    }

    static void sayHello(){
        System.out.println("Hello, World!");
        System.out.println(Hello1);

        //Methods with Arguments
        sum(10, 20);
    }

    //Methods with Arguments
    static void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }
    static void sheesh(int n1, int n2){
        System.out.println("The answer is " + n1 % n2);

    }

    //Return type
    static int multiply(int number1, int number2){
        return number1 * number2;
    }

    //Overloading Methods
    static int multiply(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    /*CHALLENGE
    * Summation of Numbers
    * Create a program that has a method named
    * summation it needs to accept an array of
    * integers then return the sum of the given array.
    *
    * PS: Display the SUM outside of the method.*/
    static int summation(int numero[]){
        int n = 0;
        for(int nnn : numero){
            n = n + nnn;
        }
        return n;
    }
}
