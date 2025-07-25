//What is a Java program equivalent to the given C code that reads an integer from input and prints its English word representation for numbers from 1 to 9, or "Greater than 9" otherwise?


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            System.exit(1);
        }

        int n = scanner.nextInt();
        scanner.close();

        if (n >= 1 && n <= 9) {
            switch (n) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else {
            System.out.print("Greater than 9");
        }
    }
}
