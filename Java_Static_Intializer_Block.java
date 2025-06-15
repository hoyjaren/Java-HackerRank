import java.util.Scanner;

public class Java_Static_Intializer_Block {
    static int B, H;
    static boolean flag = true;

    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        if (B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area = B * H;
            System.out.println(area);
        }
    }
}
