public class Encapsulation {
    public static void main(String[] args) {

        User u = new User(21231, "Jaren", "Jaren", "Tabutabo");

        u.setFirstName("Chawon");
        System.out.println(u.getFirstName());

        //OVERLOADING CONSTRUCTORS
        Employee e = new Employee("Jaren", "Tabs", "Programmer", "Mars", "Male", 21 );
        Employee e1 = new Employee("Chawon", "Hangaan", "FrontEnd");
        Employee e2 = new Employee();

        System.out.println(e2.getFirstName();
    }
}
