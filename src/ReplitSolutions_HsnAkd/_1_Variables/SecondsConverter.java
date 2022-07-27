package ReplitSolutions_HsnAkd._1_Variables;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        Scanner inputSeconds = new Scanner (System.in);

        System.out.println("Enter seconds:");

        int time = inputSeconds.nextInt();

        int hours = time / 60 / 60;
        int minutes = time / 60 % 60;
        int seconds = time % 60;

        System.out.println( hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


    }
}

/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object

Declare int variables inputSeconds, hours, minutes, seconds

Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */