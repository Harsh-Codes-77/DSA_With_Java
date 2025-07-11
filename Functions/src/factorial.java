import java.util.*;

public class factorial{
    public static int factorialOfN(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
             f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = factorialOfN(a);
        System.out.println("Factorial of " + a  + ": " + result);
    }
}