package assignments;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        System.out.println("Your Child got: " + Grading(marks) );
    }
    static String Grading(int marks){
        if(marks <= 40){
            return "Fail";
        }else if(marks >= 41 && marks <= 50 ){
            return "DD";
        }else if(marks >= 51 && marks <= 60 ){
            return "CD";
        }else if(marks >= 61 && marks <= 70 ){
            return "BC";
        }else if(marks >= 71 && marks <= 80 ){
            return "BB";
        }else if(marks >= 81 && marks <= 90 ){
            return "AB";
        }else if(marks >= 91 && marks <= 100 ){
            return "AA";
        }
        return "Error";
    }
}
