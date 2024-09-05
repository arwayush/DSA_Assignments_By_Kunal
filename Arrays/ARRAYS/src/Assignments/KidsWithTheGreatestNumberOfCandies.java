package Assignments;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] result = new boolean[candies.length];
        result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);

    }
    private  static  boolean [] kidsWithCandies(int[] arr, int n){
        boolean[] result = new boolean[arr.length];
        int maxi = Integer.MIN_VALUE;

        //finding the maximum value
        for (int i = 0; i < arr.length - 1; i++) {
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + n >= maxi){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        return result;
    }
}
