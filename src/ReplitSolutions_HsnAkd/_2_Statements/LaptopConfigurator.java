package ReplitSolutions_HsnAkd._2_Statements;
import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double screenPrice = 0;
        double cpuPrice = 0;
        double ramPrice = 0;
        double storagePrice = 0;
        double resolutionPrice = 0;



        System.out.println("Select screen size:");
        double screen = input.nextDouble();

        input.nextLine();
        System.out.println("Select CPU type:");
        String cpu = input.nextLine();

        System.out.println("Select RAM size:");
        double ram = input.nextDouble();

        input.nextLine();
        System.out.println("Select storage type:");
        String storage = input.nextLine();

        System.out.println("Enter memory size:");
        double memory = input.nextDouble();

        input.nextLine();
        System.out.println("Enter screen resolution:");
        String resolution = input.nextLine();


        if (screen == 13.3) {
            screenPrice = 200;
        } else if (screen == 15.0) {
            screenPrice = 300;
        }else {
            screenPrice = 400;
        }


        switch (cpu){
            case "i3":
                cpuPrice = 150;
                break;
            case "i5":
                cpuPrice = 250;
                break;
            case "i7":
                cpuPrice = 350;
                break;

        }


        ramPrice = (ram/4) * 50;


        switch (storage){
            case "SSD":
                storagePrice = ((memory/500) * 100);
                break;
            case "HDD":
                storagePrice = ((memory/500) * 50);
                break;
        }



        switch (resolution){
            case "FULLHD":
                resolutionPrice = 100;
                break;
            case "4K":
                resolutionPrice = 200;
                break;
        }




        System.out.println("screenPrice = " + screenPrice);
        System.out.println("cpuPrice = " + cpuPrice);
        System.out.println("ramPrice = " + ramPrice);
        System.out.println("storagePrice = " + storagePrice);
        System.out.println("resolutionPrice = " + resolutionPrice);

        double totalPrice = screenPrice + cpuPrice + ramPrice + storagePrice + resolutionPrice;
        System.out.println("Laptop price is: $" + totalPrice);

/*
        Scanner scan= new Scanner(System.in);
        double price=0;
        double priceS=0;
        double priceC=0;
        double priceR=0;
        double priceSt=0;
        double priceH=0;

        System.out.println("Select screen size:");
        double screen=scan.nextDouble();
        if(screen==13.3){
            priceS= +200;
        }else if(screen==15.0){
            priceS= +300;
        }else if(screen==17.3){
            priceS= +400;
        }else{
            System.out.println("invalid");
        }

        System.out.println("Select CPU type:");
        String cpu=scan.next();
        switch(cpu){
            case "i3": priceC= +150; break;
            case "i5": priceC=+250; break;
            case "i7": priceC=+350; break;
            default: System.out.println ("invalid");
        }


        System.out.println("Select RAM size:");
        int ramSize=scan.nextInt();
        priceR=+((ramSize/4)*50);

        System.out.println("Enter memory size:");
        int memory=scan.nextInt();


        System.out.println("Select storage type:");
        String storage =scan.next();
        switch(storage){
            case "HDD": priceSt=(memory/500)*50;break;
            default:priceSt=(memory/500)*100;
        }


        System.out.println("Enter screen resolution:");
        String resolution =scan.next();
        switch(resolution){
            case "FULLHD": priceH=+100;break;
            default:priceH=+200;
        }
        double totalP=price+priceS+priceC+priceR+priceSt+priceH;
        System.out.println("Laptop price is: $"+totalP);

*/





    }
}
/*

        Select screen size:
        Select CPU type:
        Select RAM size:
        Select storage type:
        Enter memory size:
        Enter screen resolution:
        Laptop price is: $1150.0





    Write a program that will calculate laptop price based on the components.

        First ask user for a screen size.

        If screen size is equals to 13.3, add $200 to the laptop price.
        If screen size is equals to 15.0 - add $300 to the laptop price.
        If screen size is equals to 17.3 - add $400 to the laptop price.
        Then ask user for CPU type.

        If CPU type equals to i3, add $150 to the laptop price.
        If CPU type equals to i5, add $250 to the laptop price.
        If CPU type equals to i7, add $350 to the laptop price.
        Then ask user for RAM size.

        Add $50 for every 4GB of ram to the laptop price.
        Then, ask user for storage type. There are 2 options: SSD and HDD.

        If it's HDD - add $50 to the laptop price for every 500gb.
        If it's SSD - add $100 to the laptop price for every 500GB.
        Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

        Add $100 if it's FULLHD screen
        Add $200 if it's 4K screen.
        Example:

        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i7
        Display message: Select RAM size:
        input: 8
        Display message: Select storage type:
        input: SSD
        Display message: Enter memory size:
        input: 1000
        Display message: Enter screen resolution:
        input: 4K
        Display message: Laptop price is: $1050.0
        Example #2

        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i3
        Display message: Select RAM size:
        input: 4
        Display message: Select storage type:
        input: HDD
        Display message: Enter memory size:
        input: 500
        Display message: Enter screen resolution:
        input: FULLHD
        Display message: Laptop price is: $550.0


 */