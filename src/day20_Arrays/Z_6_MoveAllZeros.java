package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Z_6_MoveAllZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array  = {10, 0, 5, 0, 1, 0};
        int [] array2 = new int[array.length];

        for (int i = 0, j=0 ; i < array.length ; i++) {
            if (array[i] != 0 ) {
                array2[j] += array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}


/*

6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */