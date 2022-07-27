package day18_NestedLoop;

import java.util.Scanner;

public class Z_2_RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int roomPrice = 0;
        int totalPrice = 0;

        while(true) {
            System.out.println("Which type of bed do you want to reserve?");
            String room = input.nextLine();

            while (! (room.equalsIgnoreCase("King Bed") || room.equalsIgnoreCase("Queen Bed") || room.equalsIgnoreCase("Single Bed"))){
                System.err.println("Invalid entry, Which type of bed do you want to reserve?");
                room = input.nextLine();
            }


            System.out.println("how many nights you will stay?");
            int night = input.nextInt();

            while (! (night > 0)){
                System.err.println("Invalid entry, how many nights you will stay?");
                night = input.nextInt();
            }

            if (room.equalsIgnoreCase("King Bed")) {
                roomPrice = 120;
            } else if (room.equalsIgnoreCase("Queen Bed")) {
                roomPrice = 100;
            } else if (room.equalsIgnoreCase("Single Bed")){
                roomPrice = 80;
            }
            totalPrice += roomPrice;

            System.out.println("would you like to reserve another room? (yes/no)");
            String roomExtra = input.next();
            while( !( roomExtra.equals("yes") || roomExtra.equals("no") ) ){
                System.out.println("Invalid Entry, would you like to select another room?");
                roomExtra = input.next();
            }
            if(roomExtra.equals("no")){
                System.out.println("Your total price is: $" + totalPrice);
                break;
            }
            input.nextLine();
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
            Then Ask the user "would you like to reserve another room?"
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

   If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry




 */