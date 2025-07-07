package abstractionTwo;

public class Main {
    public static void main(String[] args) {

        //Abstract Idea
        //Animal a = new Animal();

        Bird b = new Bird();
        Dog d = new Dog();
        Frog f = new Frog();

        b.makeSound();
        d.makeSound();
        f.makeSound();

        b.walk();
        b.fly();


    }
}
