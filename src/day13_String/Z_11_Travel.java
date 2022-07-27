package day13_String;

import java.util.Scanner;

public class Z_11_Travel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport? (Yes/No)");
        String passport = input.nextLine();


        if (passport.equals("Yes") ) {
            double costAmount = 1000;
            System.out.println("Please enter the name of the country you are travelling to?");
            String countryName = input.nextLine();

            System.out.println("How many bags you will take with you?");
            byte numberOfBags = input.nextByte();
            costAmount += 50 * numberOfBags;

            System.out.println("How many people are you travelling with?");
            short peopleNumberYouTravelWith = input.nextShort();

            if (peopleNumberYouTravelWith >= 1 && peopleNumberYouTravelWith <= 3) {
                costAmount -= 100 * peopleNumberYouTravelWith;
            } else if (peopleNumberYouTravelWith > 3) {
                costAmount -= 100 * 3;
            }
            System.out.println("Enter the name of the people they will travel with in one line, separating each name with a comma");
            input.nextLine();
            String peopleYouTravelWith = input.nextLine();

            System.out.println("Your ticket is booked to " + countryName  +
                               ". We have charged extra for the " + numberOfBags +
                               " bags but you are traveling with " + peopleYouTravelWith +
                               " so we are giving a discount. Your total cost is $" + costAmount);



        } else if (passport.equals("No")) {
            double costAmount = 200;
            System.out.println("when your passport expired");
            int years = input.nextInt();
            costAmount += 75*years;


            input.nextLine();
            System.out.println("Which country you plan to travel?");
            String allCountries = input.nextLine();

            System.out.println("You will be traveling in the next year? (Yes-No)");
            String travel = input.nextLine();
            if (travel.equals("Yes")) {
                costAmount += 100;
            } else if (travel.equals("No")) {
                costAmount = 50;
            }
            System.out.println("Looks like your password has been expired for " + years  +
                    ", but not to worry we will get it ready for you to travel to " + allCountries +
                    ". Your total cost has come out to $" + costAmount);

        }


    }
}


/*

11. Create a class calledTravel.
        Make a cost variable to calculate how much the person will owe after everything.
		    Ask the user if they have a valid passport (yes or no)

			    If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"

    		    If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."


 */

        
