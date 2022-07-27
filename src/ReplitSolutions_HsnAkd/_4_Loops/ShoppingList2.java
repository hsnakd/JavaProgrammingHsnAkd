package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item"+count + ": " + item + " Price: "+price;
            totalPrice += price;

            System.out.println("Add one more item?");

            countinue = scan.next();
            count++;
            if(countinue.equalsIgnoreCase("yes")){
                shoppingListReport +=  ", ";
            }


        } while (countinue.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport );
        System.out.println("Total price: " + totalPrice);






    }
}

/*
Item1: Avocado Price: 2.0, Item2: Waffles Price: 3.0, Item3: Grape Price: 2.5, Item4: Raspberries Price: 4.0, Item5: Milk Price: 6.0, Item6: Pineapple Price: 2.7, Item7: Pepper Price: 5.0, Item8: Blueberry Price: 2.7, Item9: Eggs Price: 7.0, Item10: Almonds Price: 5.0
Total price: 39.9
 double totalPrice = price1 + price2 + price3 ;

        System.out.println("Item1: " + item1 + " Price: " + price1 +
                ", Item2: " + item2 + " Price: " + price2 +
                ", Item3: " + item3 + " Price: " + price3);
        System.out.println("Total price: " + totalPrice);



In this assignment, you will write a program that will generate a shopping list.
It's more advanced version of assignment Shopping list I.

Your program should ask use to enter items followed by its price.
After adding item, ask user if he wants to add one more item.
If so, repeat previous steps again. If no, print shopping list report and total price as show in examples.
Your program should accept up to 10 items.

Hint: use do while loop.

Example:

output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
Example:

output: Enter Item1 and its price:
input: Lemons
input: 2.3
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Oranges
input: 6
output: Add one more item?
input: no
output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
output: Total price: 8.3



 */