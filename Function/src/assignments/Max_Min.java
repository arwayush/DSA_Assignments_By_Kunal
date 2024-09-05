package assignments;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int maxElem = maxi2(num1, num2, num3);
        System.out.println("The maximum element is: " +maxElem);

        int minElem = mini2(num1, num2, num3);
        System.out.println("The minimum element is: " +minElem);

    }


    static  int maxi2(int num1, int num2, int num3){
        int maxi = num1;
        if(num2 > maxi){
            maxi = num2;
        }
        if(num3 > maxi){
            maxi  = num3;
        }
        return maxi;
    }

    static  int mini2(int num1, int num2, int num3){
        int mini = num1;
        if(num2 < mini){
            mini = num2;
        }
        if(num3 < mini){
            mini  = num3;
        }
        return mini;
    }



    static  int maxi(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return  num1;
        }else if(num2 > num1 && num2 > num3){
            return num2;
        }else{
            return num3;
        }
    }

    static int mini(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            return  num1;
        }else if(num2 < num1 && num2 < num3){
            return num2;
        }else{
            return num3;
        }
    }
}
