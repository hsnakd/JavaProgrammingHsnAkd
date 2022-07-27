package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_2_SwapFirstAndLast {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5));


        num2.add(0,num.get(num.size()-1));

        for (int i = 1; i < num.size()-1; i++) {
            num2.add(i,num.get(i));
        }

        num2.add(num.get(0));

        System.out.println(num2);

    }
}

/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */