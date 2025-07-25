public class diamond {
    public static void diamond_pattern(int n) {

        // Upper half of diamond (including the middle row)

        for (int i = 1; i <= n; i++) {

            // Print spaces

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of diamond

        for (int i = n - 1; i >= 1; i--) {

            // Print spaces

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_pattern(5);
    }
}
