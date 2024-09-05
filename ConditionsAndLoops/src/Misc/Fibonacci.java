package Misc;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        System.out.println(b);
    }
}
