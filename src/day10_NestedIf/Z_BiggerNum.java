package day10_NestedIf;

import java.sql.SQLOutput;

public class Z_BiggerNum {




    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        System.out.println( (n1>n2 && n1>n3) ? "n1 is bigger" : (n2>n1 && n2>n3) ? "n2 is bigger" :  "n3 is bigger"  );


    }

}

/*
5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest number output: "n1 is bigger"
            if n2 is the biggest number: "n2 is bigger"
            if n3 is the biggest number: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */
