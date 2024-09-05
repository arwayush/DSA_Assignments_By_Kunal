package Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        double PrincipalAmt, rate, time;
        System.out.println("Enter the PrincipalAmt, rate, time respectively:");
        Scanner in = new Scanner(System.in);
        PrincipalAmt = in.nextDouble();
        rate = in.nextDouble();
        time = in.nextDouble();

        double depreciatedVal = PrincipalAmt* Math.pow((1 - rate/100), time);
        System.out.println("Depreciated Value after the given time is:" +depreciatedVal) ;
    }
}
