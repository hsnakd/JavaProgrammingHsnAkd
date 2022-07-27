package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_3_MultiplyOddNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5));

        for (Integer each : num) {
            if (each %2 != 0) {
                num2.add(each*2);
            } else {
                num2.add(each);
            }
        }
        System.out.println(num2);
    }
}

/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 */