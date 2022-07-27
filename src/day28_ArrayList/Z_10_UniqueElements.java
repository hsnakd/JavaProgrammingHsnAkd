package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_10_UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));



        String result = "";

        for (int j = 0; j < list.size(); j++) {
            int count = 0;
            for (Integer each : list) {
                if (list.get(j) == (each)) {
                    count++;
                }
            }
            if (count == 1) {
                result += list.get(j);
            }
        }

        System.out.println(result);
    }

}
/*
	1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
 */
