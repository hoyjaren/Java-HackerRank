import java.util.*;
public class SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char initials = '\0'; //Initialize with default value
        System.out.print("Enter your Initials: ");

        try{
            initials = input.next().charAt(0);
            initials = Character.toUpperCase(initials);
        }catch (Exception e){
            System.out.println("Invalid, please input valid letter");
            return; // Stop the program if input fails
        }

        switch (initials){
            case 'A':
                System.out.println("Boss?");
                break;
            case 'B':
                System.out.println("Kupal kaba boss?");
                break;
            case 'C':
                System.out.println("Bossing?");
                break;
            default:
                System.out.println("Bobo");
        }

        /*CHALLENGE
        * DATE FORMATTER
        * Create a program that will make the user input the Month, Date, and Year
        * as integers then use switch statements and concatenation to display it in
        * this format.
        *
        * SAMPLE OUTPUT
        * Month: 1
        * Date: 13
        * Year: 2020
        *
        * January 13, 2020
        *
        * PS: if the user inputs an invalid Month then you should tell the user that it is
        * invalid by using default keyword.
        * */


        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Date : ");
        int date = input.nextInt();
        System.out.print("Year : ");
        int year = input.nextInt();

        String monthWord = null;

        switch (month){
            case 1:
                monthWord = "January";
                break;
            case 2:
                monthWord = "February";
                break;
            case 3:
                monthWord = "March";
                break;
            case 4:
                monthWord = "April";
                break;
            case 5:
                monthWord = "May";
                break;
            case 6:
                monthWord = "June";
                break;
            case 7:
                monthWord = "July";
                break;
            case 8:
                monthWord = "August";
                break;
            case 9:
                monthWord = "September";
                break;
            case 10:
                monthWord = "October";
                break;
            case 11:
                monthWord = "November";
                break;
            case 12:
                monthWord = "December";
                break;
            default:
                System.out.println("Invalid Month");
                return;// stop the program if month is invalid
        }


        if(date > 31 || date <= 0){
            System.out.println("Invalid Date");
            return;// stop the program if date is invalid
        }
            System.out.println(monthWord+ " " + date + ", " + year);
    }
}
