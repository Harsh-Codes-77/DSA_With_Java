import java.util.*;
import java.io.*;
import java.lang.*;

class sortNames {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of names
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names); // case-sensitive sort

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }
    }
}