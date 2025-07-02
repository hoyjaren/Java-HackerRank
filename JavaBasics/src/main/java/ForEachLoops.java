import java.util.*;
public class ForEachLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Gusto ", "Kita ", "cha", "won"};

        for (String name: names){
            System.out.print(name);
        }
        System.out.println();

        //Condition in ForEachLoop
        System.out.print("Find Name: ");
        String find = input.nextLine();
        String[] pangalan = {"John", "Ja", "Doe", "Mark"};
        for (String ngalan: pangalan){
            if (ngalan.equalsIgnoreCase(find)){
                System.out.println("Nahanap ko na si " + ngalan);

            }else {
                System.out.println("Wala bobo");
                break;
            }
        }

        /*CHALLENGE
        * Array of Integers Summation
        * Create a Program that will add every integers inside
        * a pre-defined array and display its total sum.*/

        int sum = 0;
        int[] numbers = {5, 5, 5, 5, 5};
        for (int number: numbers){
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
