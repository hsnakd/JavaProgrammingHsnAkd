package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_RemoveDuplicates_Important {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length() ; i++) {

            String ch = "" + str.charAt(i);

            if( !result.contains(ch) ) {
                result += ch;
            }
        }


        return result;
    }

}

/*
uniqueChars is a method that will accept any String and return String with out any duplicate characters

Examples:

uniqueChars("cube") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"

 */