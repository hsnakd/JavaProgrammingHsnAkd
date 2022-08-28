package day44_Tasks_Abstraction_Interface;

public abstract class Car {
    private final String make, model;
    private final int year;
    private double price;
    private String color;

    // Constructor
    public Car(String make, String model, int year, double price, String color) {
        if ( make == null || make.isBlank() || make.isEmpty() ){
            throw new RuntimeException("Invalid Make : " + getColor());
        }
        this.make = make;

        if ( model == null || model.isBlank() || model.isEmpty() ){
            throw new RuntimeException("Invalid Model : " + getColor());
        }
        this.model = model;

        if ( year <= 1886 ){
            throw new RuntimeException("Invalid Year : " + getYear());
        }
        this.year = year;

        setPrice(price);
        setColor(color);
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setPrice(double price) {
        if ( price <= 0 ){
            throw new RuntimeException("Invalid price : " + getPrice());
        }
        this.price = price;
    }

    public void setColor(String color) {
        if ( color == null || color.isBlank() || color.isEmpty() ){
            throw new RuntimeException("Invalid Color : " + getColor());
        }
        this.color = color;
    }

    // Abstract Method
    public abstract void start();
    public abstract void drive();

    // Non-Abstract Method
    public final void stop(){
        System.out.println(getMake() + " " + getModel() + " is stopping through the break");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a subclass of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two subclass of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two subclasses of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a subclass of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */