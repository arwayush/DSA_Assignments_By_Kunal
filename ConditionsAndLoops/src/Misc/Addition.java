package Misc;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Enter Two numbers A & B:");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
//        int sum = A+B;
        System.out.println("The sum of 2 numbers A and B is:" +(A+B));
    }
}
