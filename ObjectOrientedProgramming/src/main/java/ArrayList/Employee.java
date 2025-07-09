package ArrayList;

public class Employee {
    String firstName, lastName;
    String birthDate, positon;
    int age;

    public Employee(String firstName, String lastName, String birthDate, String positon, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.positon = positon;
        this.age = age;
    }

    void showData(){
        System.out.println("Fullname: " + firstName + " " + lastName);
        System.out.println("Birthday: " + birthDate);
        System.out.println("Age     : " + age);
        System.out.println("Position: " + positon);
    }
}
