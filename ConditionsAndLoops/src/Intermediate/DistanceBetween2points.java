package Intermediate;

import java.util.Scanner;

public class DistanceBetween2points {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        double x1, x2, y1, y2, dis;
        x1 = in.nextDouble();
        y1 = in.nextDouble();

        x2 = in.nextDouble();
        y2 = in.nextDouble();

        dis = Math.sqrt((x2-x1)*(x2-x1)  + (y2-y1)*(y2-y1));
        System.out.println(dis);




    }
}
