public class Employee {
    private String firstName, lastName;
    private String title, address, sex;
    private int age;

    //OVERLOADING CONSTRUCTORS
    Employee(String firstName, String lastName, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        //ADD DEFAULT VALUE
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    //DEFAULT VALUE
    Employee(){
        firstName = "N/A";
        lastName = "N/A";
        title = "N/A";
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    public Employee(String firstName, String lastName, String title, String address, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
