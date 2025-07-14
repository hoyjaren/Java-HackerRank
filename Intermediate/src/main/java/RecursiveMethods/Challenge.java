package RecursiveMethods;

import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        /*Tutorial Challenge
        * Create an ArrayList of integers. Put values in it manually.
        * Pass the ArrayList inside a recursive method that outputs
        * the summation of numbers inside the said ArrayList. */

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        arrayList(numbers,0,0);

    }

    static void arrayList(ArrayList<Integer> al, int i, int sum){
        if (i == al.size()) {
            System.out.println(sum);
            return;
        }
        sum += al.get(i);
        arrayList(al, ++i, sum);
    }
}
