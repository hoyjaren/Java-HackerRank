package HashMap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        students.put(2114411310, "Jaren");
        students.put(2114411311, "Chawon");
        students.put(2114411312, "Skip");

        //Update Skip to John
        students.put(2114411312, "John");

        System.out.print("Enter Student ID: ");
        int studId = input.nextInt();
        //Read
        String name = students.get(studId);
        System.out.println("Student: " + name);

        //Delete
        //students.remove(2114411312);

        //Clear entire hashMap
        //students.clear();

        //Get the COUNT of K/V Pairs in the HashMap
        int s = students.size();
        System.out.println(s);

        //Iterating Keys
        for(int k: students.keySet()){
            System.out.println(k + " - " + students.get(k));
        }

        //Iterate the values directly
        for(String v: students.values()){
            System.out.println(v);
        }

        //Contains check Key
        if (students.containsKey(31030834)){
            System.out.println("Found Key!");
        }else {
            System.out.println("Cannot Found Key");
        }

        //Contains check value
        if (students.containsValue("Chawon")){
            System.out.println("Found Value");
        }else {
            System.out.println("Cannot Found Value");
        }
    }
}
