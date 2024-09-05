package Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double Amt, rate, time;
        int Principal, n;
        n = 3;
        rate = 18;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal Amt:");
        Principal = in.nextInt();
        System.out.print("Enter the Time:");
        time = in.nextInt();
       double temp =  Math.pow((1+rate/n), (n*time));
        Amt = Principal * temp;
        System.out.println(Amt);

    }
}
