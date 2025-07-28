public class arrayInitialization {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};               // literal initialization
        int[] b = new int[3];                 // new array of size 3 with default zeros
        b[0] = 5; b[1] = 15; b[2] = 25;      // assign individually

        for (int num : a) System.out.println(num);
        for (int num : b) System.out.println(num);
    }
}
