package abstractionTwo;

public interface airAnimal extends landAnimal {//can inherit the land animal

    void fly();

    default void sayHello(){
        System.out.println("Hello");
    }
}
