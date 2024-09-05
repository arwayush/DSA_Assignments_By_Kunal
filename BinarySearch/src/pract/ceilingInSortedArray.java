package pract;

import java.util.Scanner;

public class ceilingInSortedArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 8, 10, 11, 12, 16, 20};
//        Scanner in = new Scanner(System.in);
        int target= 15;
        int ans = ceil(arr, target);
        System.out.println("The ceiling of the given number is:" +arr[ans]);
    }

    protected static int ceil(int arr[], int target){
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid == target)
                return mid;
            else if(arr[mid] < target)
                start = mid + 1;
            else if(arr[mid] > target)
                end = mid-1;
        }
        return  start;
    }
}
