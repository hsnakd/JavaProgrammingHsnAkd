package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_11_MoveZerosToLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> list2 = new ArrayList<>();


            int count = 0;
            for (Integer each : list) {
                if (each == 0) {
                    count++;
                    continue;
                }
                 list2.add(each);

            }

            for (int i = 0; i < count; i++) {
            list2.add(0);
        }


        System.out.println(list2);
    }

}
/*
	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
 */
