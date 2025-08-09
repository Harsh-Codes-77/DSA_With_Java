import java.util.*;
import java.io.*;
import java.lang.*;

class sortNames {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }
    }
}