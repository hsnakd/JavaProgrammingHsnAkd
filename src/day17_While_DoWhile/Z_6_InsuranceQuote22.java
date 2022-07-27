package day17_While_DoWhile;

import java.util.Scanner;

public class Z_6_InsuranceQuote22 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=scan.next();

        int price=0;
        String insurance="";
        int age=0;
        int miles=0;
        String antiTheft="";
        String aOrc="";
        String married="";


        while(true) {
            System.out.println("Enter your gender(male/female)");
            String gender = scan.next().toLowerCase();

            if(gender.equals("male")||gender.equals("female")){
                break;
            }else{
                System.err.println("Invalid entry, Please re-enter");
            }


        }



        while(true){
            System.out.println("Are you married (yes/no)");
            married=scan.next().toLowerCase();

            if(married.equals("yes")||married.equals("no")){
                break;
            }else{
                System.err.println("Invalid entry, Please re-enter");
            }


        }

        while(true){
            System.out.println("Enter your age");
            age=scan.nextInt();

            if(age>0&&age<=120){
                break;
            }else{
                System.err.println("Invalid age, Please re-enter");
            }


        }

        while(true){
            System.out.println("How many miles do you drive in a day?");
            miles=scan.nextInt();

            if(miles>5){
                break;
            }else{
                System.err.println("Invalid miles, Please re-enter");
            }


        }

        scan.nextLine();
        while(true) {
            System.out.println("Do you want full coverage or liability insurance?");
            insurance = scan.nextLine().toLowerCase();

            if(insurance.equals("full coverage")||insurance.equals("liability insurance")){
                break;
            }else{
                System.err.println("Invalid entry,Please re-enter");
            }


        }
        while(true){
            System.out.println("Did you have any accidents or claims in past 5 years(yes*no)");
            aOrc=scan.next().toLowerCase();

            if(aOrc.equals("yes")||aOrc.equals("no")){
                break;
            }else{
                System.err.println("Invalid entry, please re-enter");
            }


        }


        while(true){
            System.out.println("Has your car an anti-theft device(yes/no)");
            antiTheft=scan.next().toLowerCase();

            if (antiTheft.equals("yes")||antiTheft.equals("no")){
                break;
            }else{
                System.err.println("Invalid entry,Please re-enter");
            }


        }

        if(insurance.equals("liability insurance")){
            if(age<25){
                price+=90;
            }else{
                price+=25;
            }

            if(miles<=10){
                price+=10;
            }else if(miles>10&&miles<=50){
                price+=30;
            }else{
                price+=50;
            }

        }else{
            if(age<25){
                price+=160;
            }else{
                price+=120;
            }

            if(miles<=10){
                price+=20;
            }else if(miles>10&&miles<=50){
                price+=40;
            }else{
                price+=70;
            }

        }
        if(antiTheft.equals("yes")){
            price-=price*0.05;
        }
        if(aOrc.equals("yes")){
            price+=price*0.15;
        }else{
            price-=price*0.1;
        }
        if(married.equals("yes")){
            price-=price*0.05;
        }

        System.out.println("Total price is :"+price);


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