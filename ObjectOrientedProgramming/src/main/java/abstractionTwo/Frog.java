package abstractionTwo;

public class Frog implements Animal, waterAnimal, landAnimal{

    @Override
    public void makeSound() {
        System.out.println("Ribbit!");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
