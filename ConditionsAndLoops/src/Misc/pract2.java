package Misc;

import java.util.Arrays;

public class pract2 {
    static  int x = 45;
    public static void main(String[] args) {
      demo(2,3,4,5,6,8,9);
      demo("Main hoon hero", "Maya", "Mohabbat");
    }

   static void demo(int ...v){
       System.out.println(Arrays.toString(v));
   }

   static  void demo(String ...v){
       System.out.println(Arrays.toString(v));
   }
}
