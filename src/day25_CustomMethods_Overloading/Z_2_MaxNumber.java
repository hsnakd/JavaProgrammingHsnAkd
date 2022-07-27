package day25_CustomMethods_Overloading;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Z_2_MaxNumber {
    public static void main(String[] args) {

        int [] array1 = {0,1,2,3,4};
        int [] array2 = maxNumber(array1);

        System.out.println(Arrays.toString(array2));


        System.out.println("---------------------------------------------------------------");





        System.out.println("---------------------------------------------------------------");





        System.out.println("---------------------------------------------------------------");






        System.out.println("---------------------------------------------------------------");


    }


    public static int[] maxNumber (int[] array1){
        int result = array1[0];
        for (int each : array1) {
            if (result < each) {
                result = each;
            }
        }

        return new int[]{result};
    }    



    
}

/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array



 */