package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_5_MaximumNumber {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();

        num.addAll(Arrays.asList(6,2,3,4,5));

        int max = num.get(0);
        for (Integer each : num) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);

    }
}

/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */