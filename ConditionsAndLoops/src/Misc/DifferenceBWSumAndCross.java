package Misc;

import java.util.Scanner;

public class DifferenceBWSumAndCross {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0, prod = 1;
        while(num > 0){
            int x = num%10;
            sum += x;
            prod *= x;
            num /= 10;
        }
        int diff = sum - prod;
        System.out.println(diff);
    }
}
