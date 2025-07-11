import java.util.*;

public class Main{
    public static void printHelloWorld() {
        System.out.print("Hii, ");
        System.out.println("my name is Harsh");
    };

//    Must include return if you cannot use void otherwise it gives an error.

    public static int printHello(){
        System.out.print("Return");
        return 1;
    };
    public static void main(String args[]){
        printHelloWorld();
        printHello();
    }
}