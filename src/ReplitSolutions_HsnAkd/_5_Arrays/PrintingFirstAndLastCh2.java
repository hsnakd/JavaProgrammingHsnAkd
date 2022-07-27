package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PrintingFirstAndLastCh2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO : Write your code below
        String letters = "";

        for (String s : words) {
            letters += s.charAt(0);
            letters += s.charAt(s.length()-1);
            letters += ",";
        }
        String [] letter = letters.split(",");

        System.out.println(Arrays.toString(letter));



    }
}

/*
Given a String array words, iterate through each word and print first and last letter of each element
in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */