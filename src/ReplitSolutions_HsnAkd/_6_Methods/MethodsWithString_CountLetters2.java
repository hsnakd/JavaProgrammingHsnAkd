package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_CountLetters2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += count;
            result += ch;

        }
        return result;
    }


}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

        Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */