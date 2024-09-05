package assignments;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num2 = in.nextInt();

        int ans  = sum( num, num2);
        System.out.println(ans);
        int product = prod(num, num2);
        System.out.println(product);
    }
    static int sum(int n1, int n2){
        return  n1+n2;
    }
    static int prod(int n1, int n2){
        return n1*n2;
    }
}

