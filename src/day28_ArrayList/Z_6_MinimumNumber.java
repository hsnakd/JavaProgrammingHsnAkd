package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_6_MinimumNumber {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5));

        int min = num.get(0);
        for (Integer each : num) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);

    }
}

/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */