package day21_ForEachLoop;

import java.util.Arrays;

public class Z_1_SortInteger {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arrNew = new int[arr.length];

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1, j=0; i >= 0; i--, j++) {
            arrNew[j] = arr[i];
        }
        System.out.println(Arrays.toString(arrNew));
    }
}

/*
	1. Write a program that sort the array of integer in descending order
 */