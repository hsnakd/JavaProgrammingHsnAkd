package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class TimeConversion3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        // Write your code here.

        String Array [] = s.split(":");
        String amPm = Array[2].substring(2,4);
        int hh,mm,ss;

        hh = Integer.parseInt(Array[0]);
        mm = Integer.parseInt(Array[1]);
        ss = Integer.parseInt(Array[2].substring(0,2));


        if(amPm.equals("AM") && hh == 12) {
            hh = 0;
        }
        else if(amPm.equals("PM") && hh < 12) {
            hh += 12;
        }

        System.out.printf("%02d:%02d:%02d",hh,mm,ss);

    }
}



/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)

Input: 07:05:45PM

Output: 19:05:45
Input: 07:15:55AM

Output: 07:15:55
 */