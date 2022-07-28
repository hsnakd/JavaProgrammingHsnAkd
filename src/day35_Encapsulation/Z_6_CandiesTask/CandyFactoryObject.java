package day35_Encapsulation.Z_6_CandiesTask;

import TasksSolutions.day35_Encapsulation.candiesTask.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactoryObject {
    public static void main(String[] args) {
        ArrayList<CandyClass> candies = new ArrayList();

        candies.addAll( Arrays.asList (
                new CandyClass("Haribo", 1,9,true),
                new CandyClass("Kent",   3,7,true),
                new CandyClass("M&M",    5,5,true),
                new CandyClass("Jelibon",7,3,true),
                new CandyClass("HsnAkd", 9,1,true)
    ) );

        for (CandyClass each : candies) {
            System.out.println(each.getBrand() + " : " + each.getPrice());
        }
    }
}

/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                    Add five objects of candies
                use for each loop to print the brand and price of each candy

 */