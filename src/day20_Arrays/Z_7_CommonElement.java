package day20_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Z_7_CommonElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1 [i] == arr2[j] ) {
                    System.out.println(arr1[i]);
                }
            }

        }


    }
}

/*

7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */