package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Z_1_MergeTwoArrays2 {
    public static void main(String[] args) {

        int [] array1 = {0,1,2,3,4};
        int [] array2 = {5,6,7,8,9,10};
        int [] array3 = merge(array1,array2);

        System.out.println(Arrays.toString(array3));


        System.out.println("---------------------------------------------------------------");

        double [] array4 = {0.5,1.2,2.5,3.5,4.0};
        double [] array5 = {5,6,7,8,9,10};
        double [] array6 = merge(array4,array5);

        System.out.println(Arrays.toString(array6));


        System.out.println("---------------------------------------------------------------");

        char [] array7 = {'H','S','N'};
        char [] array8 = {'A','K','D'};
        char [] array9 = merge(array7,array8);

        System.out.println(Arrays.toString(array9));


        System.out.println("---------------------------------------------------------------");


        String [] array10 = {"HSN"};
        String [] array11 = {"AKD"};
        String [] array12 = merge(array10,array11);

        System.out.println(Arrays.toString(array12));


        System.out.println("---------------------------------------------------------------");


    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }



}

/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */