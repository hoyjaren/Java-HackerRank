package abstractionTwo;

public class Dog implements Animal, landAnimal{

    @Override
    public void makeSound() {
        System.out.println("Arf!");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
