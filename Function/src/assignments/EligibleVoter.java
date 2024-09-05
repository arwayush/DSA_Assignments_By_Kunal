package assignments;

import java.util.Scanner;

public class EligibleVoter {
    public static void main(String[] args) {
        System.out.println("Enter the Age of the Voter: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();


        if(age <= 0){
            System.out.println("Invalid Age");
        }
        if(age <= 18){
            System.out.println("Not Eligible");
        }
        if(age > 18 && age < 150){
            System.out.println("Eligible");
        }
        if(age > 150){
            System.out.println("Over Age");
        }


    }
}
