package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.


        //int decimal =35;

        binary[0]= decimal%2;//1
        decimal = decimal/2;
        binary[1]= decimal%2;//2
        decimal = decimal/2;
        binary[2]= decimal%2;//3
        decimal = decimal/2;
        binary[3]= decimal%2;//4
        decimal = decimal/2;
        binary[4]= decimal%2;//5
        decimal = decimal/2;
        binary[5]= decimal%2;//6
        decimal = decimal/2;
        binary[6]= decimal%2;//7
        //decimal = decimal/2;
        binary[7]= decimal/2;
        int[] result = new int[8];

        for (int i = binary.length - 1,j=0 ; i >= 0 && j< binary.length; i--,j++) {
            result[j] =binary[i];
        }

        //System.out.println(Arrays.toString(binary));
        System.out.println(Arrays.toString(result));

    }
}

/*
A Binary number is a number expressed in the base-2 numeral system or binary numeral system,
which uses only two symbols: 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an int variable decimal, write cube program to calculate binary value of the decimal variable
and assign it to a binary array. Print out value of binary array matching below format.
Feel free to use additional arrays or formulas.

Example:

decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]

decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]

decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
 */

/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */