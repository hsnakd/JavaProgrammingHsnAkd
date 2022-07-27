package day19_LoopPractices;

import java.util.Scanner;

public class Z_6_HighestFrequency3 {
    public static void main(String[] args) {
        String s ="hsnakdhsna";
        int freq = 0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if(ch==s.charAt(j)){count++;}
            }
            if(count>freq){freq=count;}
        }
        String result ="";
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if(ch==s.charAt(j)){count++;}
            }
            if(count==freq&& !result.contains(ch+"")){
                result+=ch;
            }
        }
        System.out.println("result = " + result);

    }
}
/*
	6.  Write a program that can find the character that has the highest frequency from a string


 */



