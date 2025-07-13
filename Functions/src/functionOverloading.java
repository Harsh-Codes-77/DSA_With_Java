import java.util.*;

public class functionOverloading{
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(sum(50, 60));
        System.out.println(sum(90, 30, 70));
    }
}