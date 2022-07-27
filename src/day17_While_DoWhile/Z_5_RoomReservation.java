package day17_While_DoWhile;

import java.util.Scanner;

public class Z_5_RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int roomPrice = 0;

        System.out.println("Do you want to reserve a room?");
        String reserve = input.next();

        while (! (reserve.equalsIgnoreCase("yes") || reserve.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, do you want to reserve a room?");
            reserve = input.next();
        }
        if (reserve.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            String room = input.next();
            if (room.equalsIgnoreCase("King Bed")) {
                roomPrice = 120;
            } else if (room.equalsIgnoreCase("Queen Bed")) {
                roomPrice = 100;
            } else if (room.equalsIgnoreCase("Single Bed")) {
                roomPrice = 80;
            }
            System.out.println("Total Price : $" + roomPrice);

        } else if (reserve.equalsIgnoreCase("no")) {
            System.out.println("have a nice day");
        }



    }
}


/*

    5. Create a class called RoomReservation, write a program for the room reservation,
    your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    		(if user entered any invalid answer (other than yes/no) ask user to reenter
    		until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides
            a valid entry)


 */