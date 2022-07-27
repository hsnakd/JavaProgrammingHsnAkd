package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
         // Write your code here.
        String AmPm = "";
        String time = "";

        s = s.trim();
        for (int i = s.length()-2; i < s.length(); i++) {
            AmPm += s.charAt(i);
        }

        for (int i = 0; i < s.length()-2; i++) {
            time += s.charAt(i);
        }

        String hour = "";
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ':') {
                continue;
            }
            hour += time.charAt(i);
        }

        String hh = "";
        String mm = "";
        String ss = "";

        if (hour.length() == 5) {
            for (int i = 0; i < 1 ; i++) {
                hh += hour.charAt(i);
            }
        } else if (hour.length() == 6) {
            for (int i = 0; i < 2 ; i++) {
                hh += hour.charAt(i);
            }
        }

        for (int i = hour.length()-4; i < hour.length()-2; i++) {
            mm += hour.charAt(i);
        }
        for (int i = hour.length()-2; i <hour.length() ; i++) {
            ss += hour.charAt(i);
        }

        int h1 = Integer.parseInt(hh);

        if (s.equals("12:00:00PM")) {
            System.out.println("12:00:00");
        }else if (s.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        } else {

            if (AmPm.equals("AM")) {
                System.out.println(time);
            } else if (AmPm.equals("PM")) {
                System.out.println((h1+12) + ":" + mm + ":" + ss);
            }

        }


    }
}

/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)

Input   : 07:05:45PM
Output  : 19:05:45

Input   : 07:15:55AM
Output  : 07:15:55
 */