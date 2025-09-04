//Leetcode 912. Sort an Array

//Given an array of integers nums, sort the array in ascending order and return it.
//
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
//
//
//
//        Example 1:
//
//Input: nums = [5,2,3,1]
//Output: [1,2,3,5]
//Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
//Example 2:
//
//Input: nums = [5,1,1,2,0,0]
//Output: [0,0,1,1,2,5]
//Explanation: Note that the values of nums are not necessarily unique.
//
//
//Constraints:
//
//        1 <= nums.length <= 5 * 104
//        -5 * 104 <= nums[i] <= 5 * 104

import java.util.*;

class sortAnArray912 {
    public void merge(int nums[], int s, int m, int e){
        int n1 = m-s+1;
        int n2 = e-m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i = 0; i < n1; i++){
            arr1[i] = nums[s+i];
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = nums[m+1+i];
        }

        int i = 0, j = 0, k = s;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                nums[k] = arr1[i];
                i++;
            }else{
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            nums[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int nums[], int s, int e){
        if(s < e){
            int m = s + (e-s)/2;
            mergeSort(nums, s, m);
            mergeSort(nums, m+1, e);
            merge(nums, s, m, e);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}