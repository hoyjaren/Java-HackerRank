package Main;
import Mathematics.*;

public class Main {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
        Constants constants = new Constants();

        System.out.println(arithmetic.add(5,3));
        System.out.println(arithmetic.minus(10,5));
        System.out.println(arithmetic.multiply(2,5));
        System.out.println(arithmetic.divide(15,3));

        System.out.println(constants.pi);

        //Call the method in Constant
        constants.useArithmetic();

        //static
        int sum = Arithmetic.add(5, 2);
        System.out.println(sum);
        System.out.println(Constants.pi);

    }
}
