public class butterfly{
    public static void butterflyPattern(int n){
//        1st half
        for(int i = 1; i<=n; i++){
//            stars - i
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

//            spaces = 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

//            stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//    2nd Half

        for(int i = n; i>= 1; i--){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
//            spaces = 2*(n-i)

            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

//            stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        butterflyPattern(4);
    }
}