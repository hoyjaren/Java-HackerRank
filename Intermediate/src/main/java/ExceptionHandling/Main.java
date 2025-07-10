package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            System.out.println("Enter number: " );
            int x = s.nextInt();
        }catch (Exception e){
            System.out.println("Datatype Error!");
        }finally {
            s.close();
        }
        System.out.println("Thank you!");

        //Arithmetic Exception
        //Input Mismatch Exception
        //Array out of bounds Exception
        //File not found Exception
        //Number format Exception

        //Multiple Exception Handling
        String names[] = {"Jaren", "Skip"};
        try{

            System.out.println("Index: ");
            int index = s.nextInt();

            System.out.println(names[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of Bounds");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (InputMismatchException e){
            System.out.println("Only input integers");
        }

        //Multi-Exception Catch Block
        try{
            System.out.println("Enter number: " );
            int x = s.nextInt();
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error!");
        }catch (NumberFormatException e){
            System.out.println("Error!");
        }

    }
}
