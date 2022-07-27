package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any number that user enter will be less than 2147483647
        // min = -10
        System.out.println("Enter how many numbers to compare:");
        int totalNumbers = scan.nextInt();

        for(int i = 1; i <= totalNumbers; i++ ){

            System.out.println("Enter "+ i +". number:");
            int num = scan.nextInt(); //67, 23, 42, 5, -10

            if(num < min ){
                min = num;
            }

        }


        System.out.println("min = " + min);


    }

}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number

 */