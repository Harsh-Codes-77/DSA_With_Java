import java.util.Scanner;

public class Fibonacci{

    public static void printFibonacci(int n){
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many terms of Fibonacci series you want: ");
        int terms = scanner.nextInt();

        printFibonacci(terms);

        scanner.close();
    }
}
