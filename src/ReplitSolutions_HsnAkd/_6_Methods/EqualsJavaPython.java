package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        boolean isEqual = false;
        String [] words = sentence.split(" ");

        String word1 = "java";
        String word2 = "python";

        int countPython = 0;
        int countJava = 0;

        for (String each : words) {
            if (each.length() >=4) {
                for (int i = 0; i < word1.length(); i++) {
                    if (each.charAt(i) != word1.charAt(i)) {
                        break;
                    }
                    if (each.charAt(i) == word1.charAt(i)) {
                        countJava++;
                    }
                }
            }
        }
        for (String each : words) {
            if (each.length() >=6) {
                for (int i = 0; i < word2.length(); i++) {
                    if (each.charAt(i) != word2.charAt(i)) {
                        break;
                    }
                    if (each.charAt(i) == word2.charAt(i)) {
                        countPython++;
                    }
                }
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        if ((countJava/4) == (countPython/6)) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        System.out.println(isEqual);
    }
}

/*
Given a string, print out true if the number of appearances of "cube" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study cube not python

output: true
Example:

input: What's the difference between cube, javascript and python?

output: false
 */