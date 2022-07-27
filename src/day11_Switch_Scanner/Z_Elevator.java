package day11_Switch_Scanner;

public class Z_Elevator {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");

        int floorNum = 2;

        if (floorNum == 1 || floorNum == 2 || floorNum == 3){
            switch (floorNum){
                case 1:
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
                    break;
                case 3:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
                    break;
            //  default:
            //      System.out.println("Invalid Floor" + floorNum);
            //      break;
            }
        } else {
            System.out.println("Invalid Floor" + floorNum);
        }

        System.out.println("----------------------------------------------------");

        // Solution 2:
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("----------------------------------------------------");

        // solution 3
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; //EXIT SWITCH
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break; //exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }





    }

}
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

 */
