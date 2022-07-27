package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class MiddleOne2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        String word2 = "";
        String word3 = "";


        int ch = word.length();
        if (ch >= 3 && ch % 2 == 1) {
            int result1 = ((ch/2));
            char ch1 = word.charAt(result1);
            System.out.println(ch1);
        } else if (ch >= 3 && ch % 2 == 0) {
            int result2 = (ch/2);
            char ch2 = word.charAt(result2-1);
            char ch3 = word.charAt(result2);

            System.out.print(ch2);
            System.out.println(ch3);
        } else if (ch==1) {
            word2 = word.repeat(3);
            int result3 = ((ch/2));
            char ch4 = word2.charAt(result3);
            System.out.println(ch4);
        } else if (ch == 2) {
            word3 = word.repeat(2);

            int result4 = (ch/2);
            char ch5 = word3.charAt(result4-1);
            char ch6 = word3.charAt(result4);

            System.out.print(ch6);
            System.out.println(ch5);
        }







        }


    }

