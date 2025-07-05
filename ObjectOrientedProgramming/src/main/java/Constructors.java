import java.util.*;

public class Constructors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = input.nextLine();
        System.out.print("Enter Product Price: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Description: ");
        String description = input.nextLine();

        //Create product using constructor
        Product p = new Product(name, price, description);


    }
}
