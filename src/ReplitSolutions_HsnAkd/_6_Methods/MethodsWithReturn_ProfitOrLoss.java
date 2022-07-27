package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithReturn_ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }

    public static String profits(int buyPrice,int sellPrice){
        //your code here
        String result = "";

        if (buyPrice > sellPrice) {
            System.out.println("loss");
            System.exit(0);

        } else if (buyPrice < sellPrice) {
            System.out.println("profit");
            System.exit(0);
        } else {
            System.out.println("no loss");
            System.exit(0);

        }

        return result;
    }


}

/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines
if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"

Example

profits(100,1500)

returns: "profit"
profits(20,5)

returns: "loss"
profits(100,100)

returns: "no loss"
 */