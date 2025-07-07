package Polymorphism;

public class StrongEnemy extends Enemy{

    StrongEnemy() {
        name = "Strong";
        hp = 100;
    }

    @Override
    void dialog() {
        System.out.println(name + " I am, Strong");
    }
}
