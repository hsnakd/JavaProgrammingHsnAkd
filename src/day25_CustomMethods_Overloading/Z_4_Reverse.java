package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Z_4_Reverse {
    public static void main(String[] args) {

        int [] array1 = {0,1,2,3,4};
        int [] array2 = reverse(array1);

        System.out.println(Arrays.toString(array2));


        System.out.println("---------------------------------------------------------------");

        double [] array3 = {0.5,1.7,2.4,3.2,4.2};
        double [] array4 = reverse(array3);

        System.out.println(Arrays.toString(array4));


        System.out.println("---------------------------------------------------------------");

        char [] array5 = {'H','S','N','A','K','D'};
        char [] array6 = reverse(array5);

        System.out.println(Arrays.toString(array6));


        System.out.println("---------------------------------------------------------------");

        String [] array7 = {"HSN","AKD"};
        String [] array8 = reverse(array7);
        String [] array9 = utilities.ArraysUtility.reverse(array7);


        System.out.println(Arrays.toString(array8));
        System.out.println(Arrays.toString(array9));


        System.out.println("---------------------------------------------------------------");


    }


    public static int[] reverse (int[] array1){

        int[] result = new int[array1.length];

        for (int i = array1.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = array1[i];
        }

        return result;
    }

    public static double[] reverse (double[] array1){

        double[] result = new double[array1.length];

        for (int i = array1.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = array1[i];
        }

        return result;
    }

    public static char[] reverse (char[] array1){

        char[] result = new char[array1.length];

        for (int i = array1.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = array1[i];
        }

        return result;
    }

    public static String[] reverse (String[] array1){

        String[] result = new String[array1.length];

        for (int i = array1.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = array1[i];
        }

        return result;
    }
}

/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */