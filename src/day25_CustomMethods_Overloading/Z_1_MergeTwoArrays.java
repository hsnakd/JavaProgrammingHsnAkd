package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Z_1_MergeTwoArrays {
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


    public static int[] merge (int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];

        int i =0;
        for (int each : array1) {
            result[i] = each;
            i++;
        }
        for (int each : array2) {
            result[i] = each;
            i++;
        }

        return result;
    }    


    public static double[] merge (double[] array1, double[] array2){
        double[] result = new double[array1.length + array2.length];

        int i =0;
        for (double each : array1) {
            result[i] = each;
            i++;
        }
        for (double each : array2) {
            result[i] = each;
            i++;
        }

        return result;
    }    


    public static char[] merge (char[] array1, char[] array2){
        char[] result = new char[array1.length + array2.length];

        int i =0;
        for (char each : array1) {
            result[i] = each;
            i++;
        }
        for (char each : array2) {
            result[i] = each;
            i++;
        }

        return result;
    }


    public static String[] merge (String[] array1, String[] array2){
        String[] result = new String[array1.length + array2.length];

        int i =0;
        for (String each : array1) {
            result[i] = each;
            i++;
        }
        for (String each : array2) {
            result[i] = each;
            i++;
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