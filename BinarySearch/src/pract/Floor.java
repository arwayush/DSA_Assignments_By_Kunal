package pract;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        int arr[]= {1, 2, 8, 10, 11, 12, 16, 20};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = floor(arr, target);
        System.out.println("The floor of the given number is:" +arr[ans]);
    }

    //floor number is the greastest number less than equal to targer
    private  static  int floor(int arr[], int target){
        if(target > arr[arr.length-1])
            return -1;

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
        return  end;
    }
}
