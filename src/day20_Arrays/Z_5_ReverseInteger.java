package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Z_5_ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array [] = {1,2,3,4,5};
        String line = "";
        int arrayReverse [] = new int [array.length];

        for (int i = (array.length)-1 ; i >=0 ; i--) {
            line += " " + array[i];
        }
        System.out.println(line);

        for (int i = (array.length)-1, j=0 ; i >=0 ; i--,j++) {
            arrayReverse [j] = array[i];
        }

        System.out.println(Arrays.toString(arrayReverse));

    }
}

/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */