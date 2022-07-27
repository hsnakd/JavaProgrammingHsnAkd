package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //TODO : Write your code below

        String [] domain = email.split("@");

        String email2 = email.substring(email.indexOf("@")+1);

        if (email2.contains("@")) {
            System.out.println("invalid email");

        }else if (email.contains("@")) {
                System.out.println("Email id: " + domain[0]);
                System.out.println("Email domain: " + domain[1]);
            }else {
                System.out.println("invalid email");
            }







    }
}
 /*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
  */