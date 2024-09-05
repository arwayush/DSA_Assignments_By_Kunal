package Intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
       String Academics = " ";
       Scanner in2 = new Scanner(System.in);
       Academics = in2.next();
       double CGPA;
        Scanner in = new Scanner(System.in);
        float percent = in.nextFloat();
       switch (Academics) {
           case "Collge":
               CGPA = percent / 10;
               System.out.println(CGPA);
               break;
           case "School":
               CGPA = percent / 9.5;
               System.out.println(CGPA);
               break;
           default:
               System.out.println("Error");
       }


    }
}
