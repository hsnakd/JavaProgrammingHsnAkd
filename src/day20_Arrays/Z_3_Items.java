package day20_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Z_3_Items {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone" };
        double[] prices = {99.99,     150.0,     9.99,     250.0 ,  439.50,       39.99};
        int[] itemIDs =   {12345 ,    12346,     12347,    12348,    12349,       12350};

        System.out.println("-----------------------------------------------------");

        System.out.println(Arrays.asList(items).indexOf("Gloves"));

        System.out.println("-----------------------------------------------------");


        String check1 = "";
        for (String item : items) {
            check1 += item;
        }
        System.out.println(check1.indexOf("Gloves"));


        System.out.println("-----------------------------------------------------");


        String check2 = "";
        for (String item : items) {
           check2 += item;
        }
        System.out.println(check2.contains("iPad"));

        System.out.println("-----------------------------------------------------");


        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int itemID = itemIDs[i];
            System.out.println(item + "\t " + " - $" + + price + "\t" + " - " + itemID);
        }

    }
}

/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */