package Bsic;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] Arr = {18, 12, -7, 3, 14, 28};
        int an = min(Arr);
        System.out.println(an);
    }
    static  int min(int[]  arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
