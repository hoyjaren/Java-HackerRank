package HashMap;
import java.util.*;
public class HashMapOfObjects {
    public static void main(String[] args) {

        HashMap<String, Product> product = new HashMap<>();
        product.put("PR-001", new Product("Milk", "Milky Goodness", 10, 25.5));
        product.put("PR-002", new Product("Choco", "Choco Goodness", 20, 30));

        //Product p = product.get("PR-001");

        for(String k: product.keySet()){
            Product prod = product.get(k);
            System.out.println(k);
            prod.display();
        }

        for(Product p: product.values()){
            p.display();
        }

    }
}
