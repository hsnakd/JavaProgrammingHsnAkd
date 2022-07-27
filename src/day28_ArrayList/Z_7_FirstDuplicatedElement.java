package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Z_7_FirstDuplicatedElement {
    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));



        for (int i = 0; i < num.size()-1; i++) {
            if (num.get(i) == num.get(i+1) ) {
                System.out.println(num.get(i));
                break;
            }
        }



    }
}

/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */