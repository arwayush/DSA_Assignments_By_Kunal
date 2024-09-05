import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int[]  arr = {23, 45, 3, 8,12, 17, 90, 556};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }
    static  int LinearSearch(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }else{
            for (int index = 0; index < arr.length-1; index++) {
                if(arr[index] == num){
                    return index;
                }
            }
        }
        return -1;
    }
}
