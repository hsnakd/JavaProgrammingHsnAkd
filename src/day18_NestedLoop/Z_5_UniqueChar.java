package day18_NestedLoop;

import java.util.Scanner;

public class Z_5_UniqueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.next();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch1 = word.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch2 = word.charAt(j);

                if (ch1 == ch2) {
                    frequency++;
                }
            }


            if(frequency != 1){
                continue;
            }

            result += ch1;

        }


        System.out.println(result);



    }
}

/*

5. Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

     Hint: if you find out how to find the frequency of one character,
     then you can repeat it for the remaining characters to find the frequency.

        if frequency of a character == 1  =========> unique

 */