package Polymorphism;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();

        //Polymorphism 1 class multiple form
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
        */

        System.out.println("Enter name: " );
        String name = input.nextLine();

        Enemy we = new WeakEnemy(name);
        Enemy se = new StrongEnemy();

        we.dialog();
        se.dialog();

        we.showStats();
        se.showStats();

    }
}
