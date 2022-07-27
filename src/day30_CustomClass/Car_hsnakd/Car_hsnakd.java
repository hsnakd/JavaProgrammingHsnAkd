package day30_CustomClass.Car_hsnakd;


public class Car_hsnakd {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void drive() {
        System.out.println(brand + " is driven");
    }

    public void start() {
        System.out.println(brand + " is started");
    }

    public void stop() {
        System.out.println(brand + " is stopped");
    }

    public String toString() {
        return "Car_hsnakd{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void setInfo (String carBrand, String carModel, String carColor, int carYear, int carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }







}

/*
Car Tester:

	Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()

 */