package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String [] word = sentence.split(" ");
        for (String each : word) {
            System.out.println(each);
        }
    }
}

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
 */