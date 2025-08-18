import java.util.*;

public class smallestNumber{
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; //gives -infinity
        for(int i = 0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {10, 2, 4, 1, 8, 7, 3};
        System.out.println("Smallest value is : " + getSmallest(numbers));
    }
}