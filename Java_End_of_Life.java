import java.util.Scanner;

public class Java_End_of_Life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(number + " " +line);
            number++;
        }
        sc.close();
    }
}
