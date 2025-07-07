package Inheritance;

public class Person {

    String name, sex;
    int age;
    /* Explicit Constructor
    Person(){

    }
     */

    //Implicit Constructor
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }

}
