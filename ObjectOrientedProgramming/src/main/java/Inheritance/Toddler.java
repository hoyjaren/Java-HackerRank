package Inheritance;

public class Toddler extends Person{
    //Can add Attribute
    String favoriteGame;

    //Inherit the constructor of superclass
    Toddler(String name, String sex, int age, String favoriteGame){
        super(name, sex, age);
        this.favoriteGame = favoriteGame;
    }

    void drink(){
        System.out.println(name + "Is Drinking Milk");
    }

    //Override Methods
    @Override
    void checkStatus() {
        super.checkStatus();// inherit the attributes in superclass
        System.out.println("Favorite Game: " + favoriteGame);
    }
}
