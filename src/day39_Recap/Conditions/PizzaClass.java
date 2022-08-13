package day39_Recap.Conditions;

public class PizzaClass {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) || size == null) {
            System.err.println("Invalid Size : " + size);
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid number of cheese topping: " + numberOfCheeseTopping);
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else {
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 3) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 4) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 5) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else {
            System.err.println("Invalid number of pepperoni topping: " + numberOfPepperoniTopping);
            System.exit(0);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public PizzaClass(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    double price = 0;
    public double calcCost (){
        if (size.equalsIgnoreCase("small")) {
            price = 10 + (numberOfPepperoniTopping + numberOfCheeseTopping) * 2;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 12 + (numberOfPepperoniTopping + numberOfCheeseTopping) * 2;
        } else if (size.equalsIgnoreCase("large")) {
            price = 14 + (numberOfPepperoniTopping + numberOfCheeseTopping) * 2;
        }
        return price;
    }

    public String toString() {
        return "PizzaClass{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", price=" + calcCost() +
                '}';
    }
}

/*
5. Pizza Task:*
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */