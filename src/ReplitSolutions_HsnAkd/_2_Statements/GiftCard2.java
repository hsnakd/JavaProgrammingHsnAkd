package ReplitSolutions_HsnAkd._2_Statements;

import java.util.Scanner;

public class GiftCard2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gift = input.next();
        int giftPrice = 0;


        if (gift.equals("Blanket")) {
            giftPrice = 60;
        } else if (gift.equals("Charger")){
            giftPrice = 25;
        } else if (gift.equals("Hat")){
            giftPrice = 25;
        } else if (gift.equals("Headphones")){
            giftPrice = 30;
        } else if (gift.equals("Laptop")){
            giftPrice = 200;
        } else if (gift.equals("Pants")){
            giftPrice = 50;
        } else if (gift.equals("Pillow")){
            giftPrice = 40;
        } else if (gift.equals("Smartphone")){
            giftPrice = 1000;
        } else if (gift.equals("Socks")){
            giftPrice = 5;
        } else if (gift.equals("USB cable")){
            giftPrice = 10;
        } else {

        }


        if (gift.equals("Blanket") || gift.equals("Charger") || gift.equals("Hat") ||
                gift.equals("Headphones") || gift.equals("Laptop") || gift.equals("Pants")||
                gift.equals("Pillow") || gift.equals("Smartphone")  || gift.equals("Socks") ||
                gift.equals("USB cable")) {

            if (giftPrice <= 100) {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100-giftPrice) + "$");
            } else if (giftPrice > 100) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }
        } else {
            System.out.println("Invalid item!");
        }






    }
}
