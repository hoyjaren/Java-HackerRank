import java.util.SortedMap;

public class Product {
    String name, description;
    int price;

    Product(String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;

        System.out.println("========================Product=====================");
        System.out.println("Product Name: " + name +
                "\nProduct Price: " + price +
                "\nProduct Description: " + description);

    }
}
