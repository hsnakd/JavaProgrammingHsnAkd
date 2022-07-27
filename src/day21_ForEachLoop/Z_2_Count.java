package day21_ForEachLoop;

import java.util.Arrays;

public class Z_2_Count {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int countOdd = 0;
        int countEven = 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1, j=0; i >= 0; i--, j++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even Numbers = " + countEven);
        System.out.println("Odd Numbers = " + countOdd);
    }
}

/*
	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */