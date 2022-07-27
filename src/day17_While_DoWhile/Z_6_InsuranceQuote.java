package day17_While_DoWhile;

import java.util.Scanner;

public class Z_6_InsuranceQuote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your name");
        String name = input.nextLine();

        System.out.println("enter your gender (male/female)");
        String gender = input.next();

        while (! (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))){
            System.err.println("Invalid entry, enter your gender");
            gender = input.next();
        }

        System.out.println("are you married? (yes/no)");
        String marriage = input.next();



        while (! (marriage.equalsIgnoreCase("yes") || marriage.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, are you married?");
            marriage = input.next();
        }

        System.out.println("enter your age");
        int age = input.nextInt();

        while (! (age >= 1 && age <= 120 )){
            System.err.println("Invalid entry, enter your age");
            age = input.nextInt();
        }

        System.out.println("how many miles you drive in a day?");
        int miles = input.nextInt();

        while (! (miles > 5)){
            System.err.println("Invalid entry, how many miles you drive in a day?");
            miles = input.nextInt();
        }


        input.nextLine();
        System.out.println("are you want to full coverage or liability insurance?");
        String insurance = input.nextLine();


        System.out.println("any accidents or claims in past 5 years (Yes/No)");
        String accident = input.next();


        while (! (accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, any accidents or claims in past 5 years (Yes/No)?");
            accident = input.next();
        }

        System.out.println("car has an anti-theft device (Yes/No)");
        String device = input.next();


        while (! (device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, any accidents or claims in past 5 years (Yes/No)?");
            device = input.next();
        }

        double price = 0;

        if (insurance.equalsIgnoreCase("liability")) {

        /*
            starting prices for liability:
            age < 25 ===> 90
            age >= 25 ==> 50
        */
            if (age < 25 ) {
                price += 90;
            } else if (age >= 25){
                price += 50;
            }
        /*
            miles <= 10 ====> $10
            miles > 10 and miles <= 50 ==> $30
            miles > 50 ===>  $50
        */
            if (miles <= 10) {
                price += 10;
            } else if (miles > 10 && miles <= 50){
                price += 30;
            } else if (miles > 50){
                price += 50;
            }
        }


        if (insurance.equalsIgnoreCase("full coverage")) {

        /*
            starting prices for full coverage:
            age < 25 ===> 160
            age >= 25 ==> 120
        */
            if (age < 25) {
                price += 160;
            } else if (age >= 25){
                price += 120;
            }

        /*
            miles <= 10 ====> $20
            miles > 10 and miles <= 50 ==> $40
            miles > 50 ===>  $70
        */
            if (miles <= 10) {
                price += 20;
            } else if (miles > 10 && miles <= 50){
                price += 40;
            } else if (miles > 50){
                price += 70;
            }
        }

        // If the car has anti-theft device ==> 5% discount
        if (device.equalsIgnoreCase("yes")) {
            price -= price * 0.05;
        }


        // If he/she had any accidents or claims in past 5 years ===> 15% extra charge
        // If he/she never had any accidents or claims in past 5 years ==> 10% discount
        if (device.equalsIgnoreCase("yes")) {
            accident += price * 0.15;
        } else if (accident.equalsIgnoreCase("no")) {
            price -= price * 0.10;
        }


        // If he/she is married ==> 5% discount
        if (marriage.equalsIgnoreCase("yes")) {
            price -= price * 0.05;
        }

        System.out.println(price);

    }
}

/*

  6.    Create a class called InsuranceQuote,
        write a program that can calculate the insurance cost of a person based on the following info:

    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
				(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
				(age can not be negative or greater than 120)
				(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
				(mileage can not be negative or less than 5)
				(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount






 */