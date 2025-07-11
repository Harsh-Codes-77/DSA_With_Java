import java.util.*;

public class swapping{
    public static void swapNo(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before swap " + "a = : " + a + " b : " + b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNo(a, b);
        System.out.println("After swap " + "a : " + a + " b : " + b);
    }
}