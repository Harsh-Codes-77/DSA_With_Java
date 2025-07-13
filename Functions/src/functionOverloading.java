import java.util.*;

public class functionOverloading{

    //Function overloading using Parameters
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //Function overloading using Data Types

    public static int sum1(int a, int b){
        return a + b;
    }

    public static float sum1(float a, float b){
        return a + b;
    }

    public static void main(String args[]){
        System.out.println(sum(50, 60));
        System.out.println(sum(90, 30, 70));

        System.out.println(sum1(34, 56));
        System.out.println(sum1(56.43f, 78.76f));
    }
}