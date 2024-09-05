package Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ArmNum = in.nextInt();

        //finding the armstrong number from 0 - ArmNum
        while(ArmNum > 0){
            int sum = 0;
            int n = ArmNum;
            int rem = n%10;
            sum += rem*rem*rem;


        }
    }
}
