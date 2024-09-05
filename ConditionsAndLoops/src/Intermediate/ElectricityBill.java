package Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of units:");
        int units = in.nextInt();
        double Bill = 1;

        if(units < 100){
            Bill = units * 1.20;
        }else if(units < 200){
            Bill = (100*1.20) + (units - 100)*2;
        }else if(units > 200){
            Bill = (100*1.20) + 100*2 + (units-200)*5;
        }

        System.out.println("The total Electricity Bill to be paid is:  " +Bill);

    }
}
