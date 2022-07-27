package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_CleanString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.next()));
    }

    public static String clean (String text ,String badWord) {
        String result = "";


        if (text.contains(badWord)) {
            result = text.replaceAll(badWord, "");
            result = result.replace("  ", " ");
            result = result.trim();
        }
        return result;

    }

}

/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said"
 */