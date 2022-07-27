package day13_String;

import java.util.Scanner;

public class Z_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        String word2 = input.next();
        String word3 = input.next();


        // TASK_2

        int ch1 = word.length();
        int ch2 = word2.length();
        int ch3 = word3.length();


        if (ch1 == ch2 && ch1 == ch3) {
            System.out.println("All words are same length");
        } else if (ch1 == ch2 || ch1 == ch3 || ch2 == ch3) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }




    }
}


/*
        7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"




 */

        
