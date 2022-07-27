package ReplitSolutions_HsnAkd._3_Strings;

import java.util.Scanner;

public class SMS_Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        int senderNumber1 = message.indexOf("<")+1;
        int senderNumber2 = message.indexOf(">");
        sender = message.substring(senderNumber1,senderNumber2);
        System.out.println("Sender: " + sender);

        int phoneNumber1 = message.indexOf("[")+1;
        int phoneNumber2 = message.indexOf("]");
        phoneNumber = message.substring(phoneNumber1,phoneNumber2);
        System.out.println("Phone Number: " + phoneNumber);

        int messageNumber1 = message.indexOf("{")+1;
        int messageNumber2 = message.indexOf("}");
        messageBody = message.substring(messageNumber1,messageNumber2);
        System.out.println("Message body: " + messageBody);







    }

    }

/*

Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving} assign the value of the sender, phoneNumber, and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving

 */