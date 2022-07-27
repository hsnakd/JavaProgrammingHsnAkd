package day15_ForLoop;

import java.util.Scanner;

public class Z_1_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result += i;
            }

        }
        System.out.println(result);




    }
}



/*
	1. Write a program that can return the sum of even numbers between 1 to 100

 */