package Misc;

import java.util.Scanner;

public class SumOfNumbersTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
       while(true){
           int num = in.nextInt();
           if(num == 0){
               break;
           }else if(num !=0){
               sum += num;
           }
       }
        System.out.println(sum);

    }
}
