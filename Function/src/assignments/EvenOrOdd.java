package assignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("The Given number is: " +checkOddEven(num));
    }

    private static String checkOddEven(int num){
        if(num<=0){
            return "Invalid Number";
        }else if(num%2 == 0){
            return "Even";
        }else if(num%2 != 0){
            return "Odd";
        }
        return "Default";
    }
}
