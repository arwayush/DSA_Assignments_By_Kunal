package Intermediate;

import java.util.Scanner;

public class AverageofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while(true){
            int num = in.nextInt();
            if(num == 0){
                break;
            }else if(num != 0 && num > 0){
                sum += num;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
        double avg = sum / count;
        System.out.println(avg);
    }
}
