package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;  // any user entered number will be greater than -2147483648
        // max= 12
        System.out.println("Enter how many numbers to compare:");
        int totalNumbers = scan.nextInt();

        for (int i = 1; i <= totalNumbers; i++) {

            System.out.println("Enter "+ i +". number:");
            int num = scan.nextInt();

            if(num > max){ //if the user entered number is greater than current maximum number
                max = num;
            }

        }

        System.out.println("max = " + max);


        System.out.println("---------------------------------------------------------------------");



    }


}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */
