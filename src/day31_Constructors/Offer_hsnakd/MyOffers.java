package day31_Constructors.Offer_hsnakd;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        //    2.1 Create 7 objects of Offer
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "BankAccountObject_CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);


    //    2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

    //    2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList( myOffers )  );

        //    2.3.1 Write a program that can remove the offer objects that are not full-time
        fullTimeOffers.removeIf( p -> !p.isFullTime ); // removes the offer if the offer is NOT fulltime
        System.out.println(fullTimeOffers.size());

        //    2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList( myOffers )  );

        //    2.4.1 Write a program that can remove all the offers that are not from local
        localOffers.removeIf( p -> !( p.location.equals("VA") || p.location.equals("CA") ) ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());

            //    2.4.1.1 Write a program that can print all companyNames and salaries in "localOffers"
        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }

    //    2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.

        //    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO

    //    2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.

        //    2.6.1 Write a program that can remove all the offers that are not for SDET

    //    2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.

        //    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary



    }
}
/*
	Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object

		2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */