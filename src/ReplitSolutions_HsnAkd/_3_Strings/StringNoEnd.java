package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here


        int length1 = txt.length();

        String result1 = txt.substring(0,length1-1);
        System.out.println(result1);




    }

    }

    /*

    Given a String txt print the value without the last letter

Ex:

Input:
foo
Output:
fo
Input:
run
Output:
ru
Hint: Use substring() and length()

     */
