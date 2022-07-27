package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_1_SetTheLastElement {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();
         num.addAll(Arrays.asList(1,2,3,4,5));

        num.set(num.size()-1, 0);
        System.out.println(num);

    }
}

/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

 */