package day18_NestedLoop;

import java.util.Scanner;

public class Z_2_RoomReservation3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int totalPrice = 0;
        int price;


        while (true) {
            System.out.println("please enter the type of bedroom you want to reserve");
            String roomType = scan.nextLine();

            while (!(roomType.equals("King Bed") || roomType.equals("Queen Bed") || roomType.equals("Single Bed"))) {
                System.out.println("invalid entry ,please re enter the room type");
                roomType = scan.nextLine();
            }


            if (roomType.equals("King Bed")) {
                price = 120;

            } else if (roomType.equals("Queen Bed")) {
                price = 100;

            } else {
                price = 80;

            }


            System.out.println("How many nights you are staying");
            int amountOfNight = scan.nextInt();

            System.out.println("would you like to reserve another room?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("invalid entry ,please re enter the answer");

                answer = scan.next();

            }


            totalPrice += price * amountOfNight;


            if (answer.equals("no")) {


                System.out.println(totalPrice);

                break;
            }

            scan.nextLine();
        }


    }
}


/*


2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve,
            and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry




 */