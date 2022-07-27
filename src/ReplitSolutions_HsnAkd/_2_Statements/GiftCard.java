package ReplitSolutions_HsnAkd._2_Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gift = input.next();
        int giftPrice = 0;
        

        switch (gift){
                case "Blanket":
                    giftPrice = 60;
                    break;
                case "Charger":
                    giftPrice = 25;
                    break;
                case "Hat":
                    giftPrice = 25;
                    break;
                case "Headphones":
                    giftPrice = 30;
                    break;
                case "Laptop":
                    giftPrice = 200;
                    break;
                case "Pants":
                    giftPrice = 50;
                    break;
                case "Pillow":
                    giftPrice = 40;
                    break;
                case "Smartphone":
                    giftPrice = 1000;
                    break;
                case "Socks":
                    giftPrice = 5;
                    break;
                case "USB":
                    giftPrice = 10;
                    break;

            }



        if (gift.equals("Blanket") || gift.equals("Charger") || gift.equals("Hat") ||
                gift.equals("Headphones") || gift.equals("Laptop") || gift.equals("Pants")||
                gift.equals("Pillow") || gift.equals("Smartphone")  || gift.equals("Socks") ||
                gift.equals("USB")) {

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
