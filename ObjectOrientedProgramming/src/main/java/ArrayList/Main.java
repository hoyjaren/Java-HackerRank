package ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        //Primitive Data types
        int x;
        float z;
        double a;
        char b;
        boolean y;
        byte i;

        //Non primitive data type
        String name ;
        Student ab;

        //(WRAPPER CLASS)
        Integer s;
        Float d;
        Character f;
        Double g;
        Byte j;
        //ArrayList with Primitive datatype
        ArrayList<Integer> number = new ArrayList<Integer>();

        */

        //ArrayList
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jaren");
        names.add("Chawon");

        System.out.println(names.get(1));
        names.set(1, "Cha");
        System.out.println(names.get(1))
        ;
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);

        ArrayList<Student> students = new ArrayList<Student>();
        //Create
        students.add(new Student("Skipmakliw", "BSIT"));
        students.add(new Student("Jaren", "BSCS"));
        students.add(new Student("John", "BSIS"));

        //Read
        //students.get(0).introduce();

        //Update
        students.set(0, new Student("Chawon", "BSEMC"));
        //students.get(0).introduce();

        //Delete
        students.remove(0);
        //students.get(0).introduce();
        //students.clear(); clear arraylist

        //Arraylist Size
        System.out.println(students.size());

        //Iterating Arraylist
        for (int i = 0; i <students.size(); i++){
            students.get(i).introduce();
        }

    }

}
