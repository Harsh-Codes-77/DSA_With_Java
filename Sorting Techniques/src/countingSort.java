import java.util.*;

public class countingSort{

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    public static void CountingSort(int[] arr){
//        find the largest element of the arrray
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i<count.length; i++){
            for(int j = 0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }

    public static void display(int[] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        CountingSort(arr);
        display(arr);
    }
}