public class solidRhombus{
    public static void solid_rhombus(int n) {
        for(int i = 1; i <=n; i++){
//            Spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
//            Stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solid_rhombus(5);
    }
}