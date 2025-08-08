//Given a positive integer N, find the sum of all numbers from 1 to N such that:
//
//For numbers less than 10, add them directly to the sum.
//
//For numbers greater than or equal to 10, instead of adding the number itself, add the sum of its digits.
//
//For Example:
//        If N = 12, the calculation should be:
//        1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + (1+0) + (1+1) + (1+2) = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 1 + 1 + 1 + 1 + 2 = 49
//
//Input:
//
//A single integer N (N ≥ 1)
//
//Output:
//
//Print the computed sum as described above.
//
//        Constraints:
//
//        1 ≤ N ≤ 10,000 (or as given by the user)
//
//Input is always valid (no negative numbers or non-integers).

import java.util.*;

public class sumOfNnaturalNumber {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 10) {
                sum += i;
            } else {
                sum += digitSum(i);
            }
        }

        System.out.println("Special sum from 1 to " + N + " is: " + sum);
        sc.close();
    }
}

