package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber_hsnakd {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));


        int n = 5;
        for (int i = 1; i < n; i++) {
           num.removeIf(p -> p == Collections.max(num));
        }

        Integer max = Collections.max(num);
        System.out.println(max);


    }


}
/*
1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */