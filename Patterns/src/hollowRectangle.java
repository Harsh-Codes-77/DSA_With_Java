public class hollowRectangle{
    public static void hollow_rectangl(int totRows, int totCols){
//        Outer loop
        for(int i = 1; i<= totRows; i++){
//            inner columns
            for(int j = 1; j <= totCols; j++){
//                cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
//                    Boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangl(3, 5);
    }
}