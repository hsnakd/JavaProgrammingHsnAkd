package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWords2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //TODO.write your code below

        String [] shortLength1 = str.split(", ");
        Arrays.sort(shortLength1);

        String minLength1 = "";

        minLength1 = shortLength1[0];

        for( int i = 0, j=0; i < shortLength1.length; i ++) {
            for( j =i+1; j < shortLength1.length; j++) {
                if(minLength1.length() > shortLength1[j].length()) {
                    minLength1 = shortLength1[j];
                }
            }
        }












        String [] words = str.split(", ");
        int count=0;
        String minLength2 = "";


        for (int i = 0; i < words.length; i++) {
            if ( minLength1.length() >= words[i].length()) {
                minLength2 += words[i] + ",";
                count++;
            }
        }

        String [] shortLength2 = minLength2.split(",");
        Arrays.sort(shortLength2);

        System.out.println(Arrays.toString(shortLength2));


    }
}

/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, cube, coffee, cat, ray

output: [cat, old, ray]
 */