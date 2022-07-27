package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        
        
        boolean hasBread1 = str.contains("bread");

        if (hasBread1) {
            String str1 = str.substring(str.indexOf("bread"));
            String str2 = str1.substring(5);
            boolean hasBread2 = str2.contains("bread");
            boolean hasBread3 = str1.contains("breadbread");
            System.out.println("str1 = " + str1);
            System.out.println("str2 = " + str2);

            if (hasBread3) {
                int index4 = str1.indexOf("breadbread");
                String str4 = str2.substring(0,index4+8);
                System.out.println("str4 = " + str4);

            }else if (hasBread2) {
                int index3 = str2.indexOf("bread");
                String str3 = str2.substring(0,index3);
                System.out.println("str3 = " + str3);
            } else {
                System.out.println("nothing");
            }
        } else {
            System.out.println("nothing");
        }









    }



}
/*

A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadapple

output: nothing
input: breadbutterbread

output: butter

 */