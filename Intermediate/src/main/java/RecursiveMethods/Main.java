package RecursiveMethods;

public class Main {
    public static void main(String[] args) {
        sayHello(3);

        //Recursion Iteration
        String[] names = {"Jaren", "John", "Chawon", "Josh"};
        printArray(names, 0);

    }
    static void sayHello(int count){
        if (count == 0) return;
        System.out.println("Hello!");
        sayHello(--count);
    }

    //Recursion Iteration
    static  void printArray(String[] array, int i){
        if(i == array.length) return;

        System.out.println(array[i]);
        printArray(array, ++i);
    }

}
