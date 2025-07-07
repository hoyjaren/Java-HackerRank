package Polymorphism;

public class WeakEnemy extends Enemy{

    WeakEnemy(){
        name = "Weak";
        hp =  50;
    }
    WeakEnemy(String name){
        this.name = name;
        hp = 100;
    }

    void dialog() {
        System.out.println(name + " I am, Weak");
    }

}
