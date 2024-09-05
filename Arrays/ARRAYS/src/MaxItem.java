public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 34, 4, 4};
        int maxi = max(arr);
        System.out.println("The max value is:" +maxi);
        System.out.println(max(arr));
    }
    private static  int max(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        return  temp;
    }
}