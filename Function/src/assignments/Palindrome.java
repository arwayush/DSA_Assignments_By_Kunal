package assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }



    //function to check the palindrome
    private static boolean isPalindrome(int n){
        int rev = 0;
        int dup = n;
        while(n > 0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return (rev == dup);
    }
}
