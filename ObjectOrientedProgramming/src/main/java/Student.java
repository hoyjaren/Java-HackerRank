public class Student {
    String firstName, lastName, course, section;
    int year;
    float midtermGrade, finalGrade;

    public Student(String firstName, String lastName, String course, String section, int year, float midtermGrade, float finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduceSelf(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Fullname: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Year and Section: " + year+ course + "-" + section);
    }

    void evaluateGrade(){
        float average = (midtermGrade + finalGrade) / 2;
        System.out.println("Your GWA: " + average);
        
        if (average < 1.0){
            System.out.println("Invaldid Grade");
        } else if (average <= 1.25 && average >= 1.0) {
            System.out.println("Magna Cum Laude");
        } else if (average <= 1.75 && average >= 1.50) {
            System.out.println("Cum Laude");
        } else if (average <= 2.75 && average >= 2.0) {
            System.out.println("Passed");
        } else if (average < 3.0) {
            System.out.println("Failed");
        }

    }
}
