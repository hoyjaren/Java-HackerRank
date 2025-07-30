import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Java_Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases --> 0){
            String pattern = in.nextLine();
            //Write your code
            System.out.println(isValid(pattern) ? "Valid" : "Invalid");
        }
    }

    public static boolean isValid(String pattern){
        try {
            Pattern.compile(pattern);
            return true;
        }catch (PatternSyntaxException e){
            return false;
        }
    }
}
