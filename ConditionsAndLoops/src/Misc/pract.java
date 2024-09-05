package Misc;

import java.util.Arrays;
import java.util.Scanner;

public class pract {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,560};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
  static  void change(int[] nums){
        nums[0] = 89;
  }
}
