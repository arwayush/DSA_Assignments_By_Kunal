package Misc;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = factorial(num);
        System.out.println("The factorial is: " +ans);
    }

    private static  int factorial(int n){
        int fact = 1;
        while(n > 0){
            fact *= n;
            n--;
        }
        return  fact;
    }
}
//works till 33
