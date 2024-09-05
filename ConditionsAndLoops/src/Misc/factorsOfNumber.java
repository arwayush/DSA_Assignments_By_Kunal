package Misc;

import java.util.Scanner;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();
        int count = 0;
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                System.out.println(i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("It is a prime");
        }else{
            System.out.println("The total number of factors are: " +count);
        }
    }
}
