package ReplitSolutions_HsnAkd._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));
    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        char letter = 'e';
        String [] fewValues = new String[arr.length];

        ArrayList<String> newList = new ArrayList<>();

        for (String each : arr) {
            for (int i = 0, j=0; i < each.length(); i++) {
                if (each.charAt(i) == letter) {
                    newList.add(each);
                    break;
                }
                j++;
            }
        }

        fewValues = newList.toArray(new String[0]);

        //TODO :YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }

}

/*
Finish the getWithE. Given a String array arr with the following elements

["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter e in them

You need to know how many element contain e and create array accordingly

Values in fewValues array need to be ["zero", "one","three"]

Examples:

arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "fury", "spoon"]
fewValues ->["e", "hey", "bye"]
 */