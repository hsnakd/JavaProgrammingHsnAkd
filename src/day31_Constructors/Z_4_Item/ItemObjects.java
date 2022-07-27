package day31_Constructors.Z_4_Item;

public class ItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item("Pencil", 15.50,10);
        System.out.println(item1);
    }
}

/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()


 */