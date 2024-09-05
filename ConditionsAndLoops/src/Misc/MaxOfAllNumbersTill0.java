package Misc;

import java.util.Scanner;

public class MaxOfAllNumbersTill0 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE;
        while (true){
            int num = in.nextInt();
            if(num == 0){
                break;
            }else if(num != 0){
                if(num > maxi){
                    maxi = num;
                }
            }
        }
        System.out.println("The maximum number is:" +maxi);
    }
}
