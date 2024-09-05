package assignments;

import java.util.ArrayList;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        ArrayList<Integer> list =new ArrayList<Integer>()
        int size = arr.length;
        boolean ans = pythagoreanTriplet(arr, size);
        System.out.println(ans);
    }
    private  static  boolean pythagoreanTriplet(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if(x == y+z || y == x+z || z == x+y){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
