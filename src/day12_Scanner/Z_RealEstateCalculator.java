package day12_Scanner;

import java.util.Scanner;

public class Z_RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE


        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        int housePrice=0;
         switch (houseType){
             case "Condo":
                 housePrice = 50000;
                break;
             case "Townhouse":
                 housePrice = 75000;
                 break;
             case "Single Family Home":
                 housePrice = 95000;
                 break;
         }

        System.out.println("How many bedrooms do you have?");
         numberOfBedrooms = scan.nextInt();
         int bedroomPrice = numberOfBedrooms * 30000;


        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        int backyardPrice=0;

        if (houseType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        } else  if (backyard) {
            backyardPrice = 5000;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        int garageSpotsPrice=0;

        System.out.println("How many spots?");
        garageSpots = scan.nextInt();

        if (garage == true){
            if (garageSpots <= 10){
                garageSpotsPrice = garageSpots * 20000;
            } else {
                System.out.println("Pardon, it's not a public parking!");
        }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        int metroPrice=0;
        if (metroAccessibility <= 1) {
             metroPrice =  10000;
        } else if (metroAccessibility>1 &&  metroAccessibility <=3) {
             metroPrice =  5000;
        }


        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        int highwayPrice=0;

        if (highwayAccessibility <= 1) {
             highwayPrice =  15000;
        } else if (highwayAccessibility>1 &&  highwayAccessibility <=5) {
             highwayPrice =  8000;
        } else if (highwayAccessibility>5 &&  highwayAccessibility <=20) {
             highwayPrice =  4000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore= scan.nextFloat();
        int schoolPrice=0;
        if (schoolScore <= 10 && schoolScore>=8) {
             schoolPrice =  45000;
        } else if (schoolScore < 8 && schoolScore>=4) {
             schoolPrice =  20000;
        } else  {
             schoolPrice =  5000;
        }


        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        int smokingPrice=0;

        if (smoking == true) {
            smokingPrice = -5000;
        }



        propertyPrice = housePrice + bedroomPrice + backyardPrice + garageSpotsPrice + metroPrice + highwayPrice + schoolPrice + smokingPrice;

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");

        System.out.println("housePrice = " + housePrice);
        System.out.println("bedroomPrice = " + bedroomPrice);
        System.out.println("backyardPrice = " + backyardPrice);
        System.out.println("garageSpotsPrice = " + garageSpotsPrice);
        System.out.println("metroPrice = " + metroPrice);
        System.out.println("highwayPrice = " + highwayPrice);
        System.out.println("schoolPrice = " + schoolPrice);
        System.out.println("smokingPrice = " + smokingPrice);

        }
    }
/*
 */