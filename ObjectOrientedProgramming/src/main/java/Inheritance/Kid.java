package Inheritance;

public class Kid extends Toddler{
    String gradeLvl;
    public Kid(String name, String sex, int age, String favoriteGame, String gradeLvl) {
        super(name, sex, age, favoriteGame);
        this.gradeLvl = gradeLvl;
    }

    void sayGradeLvl(){
        System.out.println("I am " + gradeLvl);
    }


}
