package day06_Week02;

public class ShoppingList {
    public static void main(String[] args) {

        String item1 = "Tomatoes";
        double price1 = 5.5;
        System.out.println(item1 + " = " + price1);

        String item2 = "Cheese";
        double price2 = 3.5;
        System.out.println(item2 + " = " + price2);

        String item3 = "Apple";
        double price3 = 6.3;
        System.out.println(item3 + " = " + price3);

        double totalPrice = price1 + price2 + price3;
        System.out.println("Total Price = " + totalPrice);

        System.out.println("--------------------------------");

        String report = item1+" : "+price1+", "+item2+" : "+price2+", "+item3+" : "+price3+ " = "+totalPrice;
        System.out.println("report = " + report);


        System.out.println("-----------");



    }



/*
    In this assignment you will write a program to create a shopping list and prices.

Enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */
}
