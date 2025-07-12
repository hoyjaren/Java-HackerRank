package ParsingData;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Parsing Data
        String x = "153";
        int num = Integer.parseInt(x);
        System.out.println(x+1);
        System.out.println(num + 1);

        /*To avoid Scanner problem use parse
        do {
            try{
                System.out.println("Number : ");
                float num1 = Float.parseFloat(input.nextLine());

                System.out.println("Name : ");
                String name = input.nextLine();

                System.out.println();
                System.out.println(num1);
                System.out.println(name);
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
            }

        }while (true);*/

        //String value of
        float pi = 3.14f;
        String a = String.valueOf(pi);
        System.out.println(pi + 1);
        System.out.println(a + 1);

        //widening type casting
        System.out.println("Widening type casting");
        byte b = 127;
        short sho = b;
        int i = sho;

        //narrowing type casting
        System.out.println("Narrow type casting");
        double pie = 3.14;
        float f = (float)pie;
        int n = (int)f;

        System.out.println("Double  : " + pie);
        System.out.println("Float   : " + f);
        System.out.println("Integer : " + n);//data loss or lossy conversion

        //primitive datatype vs wrapper class
        int integer = 12;
        Integer iWrap = 5;

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(21);
        numbers.add(19);
        System.out.println(numbers);

    }
}
