package abstractionOne;

public class Main {
    public static void main(String[] args) {

        //Abstract Idea cannot be instantiated
        //Animal a = new Animal();

        //CONCRETE idea
        Animal d = new Dog();
        Animal c = new Cat();

        d.setName("Dogie");
        c.setName("Catty");
        d.showName();
        c.showName();
        d.makeSound();
        c.makeSound();
    }
}
