import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        System.out.println("The iitem at the index 4 is" +list.get(4)) ;


    }
}
