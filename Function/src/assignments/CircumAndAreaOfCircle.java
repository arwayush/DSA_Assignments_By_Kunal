package assignments;

import java.util.Scanner;

public class CircumAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();


        double circum = circumference(radius);
        System.out.println(circum);
        double Area = area(radius);
        System.out.println(Area);

    }
    static double circumference(int radius){
        return  2 * 3.14 * radius;
    }
    static double area(int radius){
        return  3.14*radius*radius;
    }
}
