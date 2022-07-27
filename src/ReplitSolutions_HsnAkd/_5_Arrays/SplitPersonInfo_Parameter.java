package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class SplitPersonInfo_Parameter {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here

        String person = info;

        String [] word = person.split(",");


            System.out.println("person name: " + word[0]);
            System.out.println("last name: " + word[1]);
            System.out.println("age: " + word[2]);


    }



}

/*
The method person has a string arguement with this format: "name,last name,age".
Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char
 */