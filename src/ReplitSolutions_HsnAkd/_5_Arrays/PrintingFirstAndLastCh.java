package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.Scanner;

public class PrintingFirstAndLastCh {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (String s : words) {
                System.out.print(s.charAt(0));
                System.out.print(s.charAt(s.length()-1));
                System.out.println();
        }

    }
}

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */