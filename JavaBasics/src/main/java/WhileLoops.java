import java.util.*;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.print("Input name: ");
        String name = input.nextLine();

        String[] names = {"Skip", "Ja", "Phil", "Joshua", "Kyle", "Emman"};
        int i = 0;

        //While Loop
        while (i < names.length){
            System.out.println(greet+ " " +names[i]);
            i++;
        }

        //Do While Loop
        int a = 5;

        do {
            System.out.println("this will print once");
        }while (a < 5);

        //Conditions in While Loop

        while(i < names.length){
            if(names[i].equalsIgnoreCase(name)){
                System.out.println("We found " + names[i]);
                break;
            }else {
                System.out.println(names[i]);
            }
            i++;
        }

        /*CHALLENGE
        * Quiz Game w/ Lives
        * Create a program that will ask the user a question make the user answer
        * that question, check if its correct if not deduct a life to the user and
        * ask the question again until their lives runs out or they answer correctly.
        *
        * if they answered the question correctly then tell the user that they WON!
        *
        * if they run out of lives then tell the user that they LOST!
        * */

        int lives = 5;
        String answer;

        while(lives > 0){
            System.out.print("What is the Capital of the Philippines: ");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("Manila")){
                System.out.println("Correct");
                break;
            }else {
                lives--;

                if (lives > 0){
                    System.out.println("\nTry again\n");
                }else {
                    System.out.println("Bobo ka");
                }
            }
        }
    }
}
