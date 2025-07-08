package arrayOfObjects;

public class Employee {
    String firstName, lastName;
    String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    void introduceSelf(){

        System.out.println("Fullname : " + firstName + " " + lastName);
        System.out.println(" Job Title: " + jobTitle);

    }


}
