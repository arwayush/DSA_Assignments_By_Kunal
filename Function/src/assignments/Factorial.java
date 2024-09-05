package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int ans = FactorialOfNum(num);
        System.out.println(ans);
    }

    //function to find the factorial of the number
    static int FactorialOfNum(int num){
        int temp = 1;
        if(num <= 0){
            return -1;
        }
        if(num ==1 || num == 0){
            return 1;
        }
        while (num > 0){
            temp *= num;
            num--;
        }
        return temp;
    }
}
