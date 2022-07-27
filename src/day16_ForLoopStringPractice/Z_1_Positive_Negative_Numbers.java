package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Z_1_Positive_Negative_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int negNum =0;
        int posNum =0;
        int zeroNum =0;

        for (int i = 1; i <= number; i++) {
            System.out.println("Enter "+ i +". number:");
            int num = input.nextInt();
            if (num < 0) {
                negNum++;
            } else  if (num > 0) {
                posNum++;
            } else {
                zeroNum++;
            }
        }
        System.out.println("Positive : " + posNum + ", Negative : " + negNum + ", Zero : " + zeroNum);


    }
}



/*

1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */