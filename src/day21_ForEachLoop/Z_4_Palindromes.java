package day21_ForEachLoop;

import java.util.Scanner;

public class Z_4_Palindromes {
    public static void main(String[] args) {
        String[] arr =  {"anna", "level", "Java"};
        int count = 0;

        for (String each : arr) {
            String arrReverse ="";
            for (int i = each.length()-1; i >= 0 ; i--) {
                arrReverse += each.charAt(i);
            }
            if (arrReverse.equalsIgnoreCase(each)) {
               count++;
            }
        }

        System.out.println("Palindromes : " + count);
    }
}

/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */