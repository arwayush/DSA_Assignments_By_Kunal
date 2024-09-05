package Intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double  marketPrice, discount, CostPrice, profit, sellingPrice;
        System.out.print("Enter the cost Price: ");
        CostPrice = in.nextDouble();
        System.out.print("Enter the Discount percentage: ");
        discount = in.nextDouble();
        System.out.print("Enter the Market Price");
        marketPrice = in.nextDouble();


        double temp;
        temp = 100-discount;

       sellingPrice = (temp * marketPrice) / 100;
       profit = sellingPrice - CostPrice;
        System.out.println("The customer need to pay: " +sellingPrice);
        System.out.println("The Profit gained by the seller is: "+profit);
    }
}
