package ReplitSolutions_HsnAkd._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SwitchElements_WithArrayList {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {

        Integer numbers = 0;
        ArrayList<Integer> numsList = new ArrayList<>();

        for (int each : i) {
            numsList.add(each);
        }


        Collections.swap(numsList, 0, numsList.size()-1);


        System.out.println(numsList);


        return i;
    }
}