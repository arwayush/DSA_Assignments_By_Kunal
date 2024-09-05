package Intermediate;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Amount:");
        double  amt = in.nextDouble();
        System.out.print("Enter the commision percentage:");
        double commPercent = in.nextDouble();

        double CommisionValue = amt*(commPercent / 100);
        System.out.println(CommisionValue);

    }
}
