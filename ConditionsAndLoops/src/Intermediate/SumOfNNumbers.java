package Intermediate;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int num = on.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}
