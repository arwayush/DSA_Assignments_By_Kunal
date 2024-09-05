package assignments;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int num){
        //if a number is divided by itself, 1, and not else;
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return  true;
    }
}
