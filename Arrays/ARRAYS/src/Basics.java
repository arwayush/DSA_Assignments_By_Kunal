import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//       Scanner in  = new Scanner(System.in);
//       int[] arr = new int[5];
//       //input type 1
//        arr[0] = 45;
//        arr[4] = 33;


       //2nd input type
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        //enhanced for loop
//        for(int num: arr){
//            System.out.println(num);
//        }

        //one more type to print
//        System.out.println(Arrays.toString(arr));




//        Scanner in = new Scanner( System.in);
//        String[] str = new String[5];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));

        int[] nums = {2,3,54,67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change (int[] arr){
        arr[0] = 666;
    }
}
