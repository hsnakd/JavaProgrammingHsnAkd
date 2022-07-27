package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class Email_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //your code here

        if (email.contains("_")){


        int senderNumber = email.indexOf("_");
        int senderNumber2 = email.indexOf("@");

        String first = email.substring(0,senderNumber);
        String second = email.substring(senderNumber+1,senderNumber2);
        String third = email.substring(senderNumber2);

        System.out.println(second + "_" + first + third);
        } else {
            System.out.println(email);
        }
    }

    }

/*

Swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com


 */