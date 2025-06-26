public class VariablesAndDataTypes {
    public static void main(String[] args) {

        //BASIC DATA TYPES
        char section = 'A';
        String name = "Pogi";
        boolean isTall = true;
        int age = 22;
        float avg = 1.39f;
        double gwa = 95.5;
        System.out.println(name);

        //To change the value of name variable
        name = "Jaren";
        System.out.println(name);

        //Concatenation
        System.out.println("Hello, my name is " + name);

        System.out.println("======================CHALLENGE===========================");
        //Challenge
        /*Sentence Builder Challenge
        * Create a program that will only require the programmer to change the variable
        * values in order to create a dynamic sentence using the sentence in the Sample
        * Output
        *
        * Sample Output:
        * Hi! my name is Jaren SDPT
        * I am 22 Years Old
        * My GPA is 2.25
        * My bloodtype is O
        * */

        String myName = "Jaren";
        int myAge = 22;
        float gpa = 2.25f;
        char bloodType = 'O';

        System.out.println("Hi! my name is " + myName + " SDPT");
        System.out.println("I am "+ myAge + " Years Old");
        System.out.println("My GPA is " + gpa);
        System.out.println("My bloodtype is " + bloodType);
    }
}
