import java.util.*;

public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pi = 3.14F;
        int r = sc.nextInt();
        float area = pi*r*r;
        System.out.println(area);
    };
};