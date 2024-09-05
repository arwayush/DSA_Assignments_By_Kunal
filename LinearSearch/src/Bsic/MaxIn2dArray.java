package Bsic;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {77,78}
        };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints: arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
