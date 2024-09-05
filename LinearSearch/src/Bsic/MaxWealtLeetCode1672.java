package Bsic;

public class MaxWealtLeetCode1672 {
    // https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int [][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            //after this check for the maximum
            if(sum > ans){
                ans = sum;
            }
        }
        return  ans;
    }
}
