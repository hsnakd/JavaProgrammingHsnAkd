package ReplitSolutions_HsnAkd._6_Methods;

import java.util.*;

public class SwitchElements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
//        System.out.println(Arrays.toString(do_switch(arr)));

        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {

            int tmp = i[0];
            i[0] = i[i.length-1];
            i[i.length-1] = tmp;

        System.out.println(Arrays.toString(i));
        return i;
    }
}