package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class ReverseLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here

        String result = "";
        String resultSCh = "";
        String resultL1 = "";
        String resultL2 = "";


        for (int i=0; i < str.length(); i++) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                resultSCh += str.charAt(i);
            }
            if (Character.isLetterOrDigit(str.charAt(i))) {
                resultL1 += str.charAt(i);
            }
        }



        for (int i = resultL1.length()-1; i >=0 ; i--) {
            resultL2 += resultL1.charAt(i);
        }


     //   String resultL3 =  resultL2 + resultSCh;
       // String resultSCh3 = resultSCh + resultL2;


        for (int i=0,j=0,k=0; i <str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                    result += resultSCh.charAt(j);
                    j++;
            }else if (Character.isLetterOrDigit(str.charAt(i))) {
                    result += resultL2.charAt(k);
                k++;

            }
        }

    return result;

    }


}

/*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"

Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---"
Output:  str = "----dgf--y--tre...wq.---"
 */