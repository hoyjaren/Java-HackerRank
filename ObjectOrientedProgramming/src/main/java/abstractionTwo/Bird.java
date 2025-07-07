package abstractionTwo;

public class Bird implements Animal, airAnimal{

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
