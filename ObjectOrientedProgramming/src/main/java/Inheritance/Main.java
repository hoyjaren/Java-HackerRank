package Inheritance;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jaren", "Male", 22);
        Toddler t = new Toddler("Chawon", "Female", 22, "Roblox");
        Kid k = new Kid("Java", "Male", 7, "ML", "Grade 1");
        /*
        p.name = "Jaren";
        p.age = 22;
        p.sex = "Male";

        t.name = "Chawon";
        t.age = 22;
        t.sex = "Female";
        */

        //p.checkStatus();

        //Can Inherit the attributes and methods in superclass
        //t.checkStatus();
        //t.drink();

        k.checkStatus();
        //Inherit the Inheritance
        k.sayGradeLvl();

    }
}
