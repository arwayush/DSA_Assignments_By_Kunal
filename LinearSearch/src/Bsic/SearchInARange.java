package Bsic;

import java.util.Scanner;

public class SearchInARange {
    public static void main(String[] args) {
        //searching a value in the range from 2 to 7
        int[]  arr = {23, 45, 3, 8,12, 17, 90, 556};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int start = 2, end = 6;
        int ans = LinearSearch(arr, target, start, end);
        System.out.println(ans);
    }
    static  int LinearSearch(int[] arr, int num, int low, int high){
        for(int i = low; i<=high; i++){
            if(arr[i] == num){
                return  i;
            }
        }
        return -1;
    }
}
