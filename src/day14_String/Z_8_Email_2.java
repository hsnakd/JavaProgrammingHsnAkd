package day14_String;

import java.util.Scanner;

public class Z_8_Email_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //your code here



        int senderNumber = email.indexOf("_");
        int senderNumber2 = email.indexOf("@");
        int senderNumber3 = email.indexOf(".");

        String first = email.substring(0,senderNumber);
        String last = email.substring(senderNumber+1,senderNumber2);
        String domain = email.substring(senderNumber2+1,senderNumber3);


        //  to UpperCase just first letter ****
        String firstName = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        System.out.println("First name: " + firstName);

        String lastName = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);



    }

    }

/*

Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple




    Scanner scan = new Scanner(System.in);
    String email = scan.next();
    String lastName=(email.charAt(email.indexOf('_')+1)+"").toUpperCase()+email.substring(email.indexOf('_')+2,email.indexOf('@'));
    String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
    System.out.println("First name: "+firstName+"\nLast name: "+lastName+"\nDomain: "+domain);


*/