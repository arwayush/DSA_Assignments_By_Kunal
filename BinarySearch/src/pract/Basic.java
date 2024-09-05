package pract;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //input is to be taken from the keyboar
       String str = input.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.trim().charAt(i);
            if (ch >= 'a' && ch <= 'z') {

                System.out.println("Lowecase");
            }else if(ch>='A' && ch<='Z'){
                System.out.println("Uppercase");
            }else{
                System.out.println("Error");
            }

        }
    }
}
