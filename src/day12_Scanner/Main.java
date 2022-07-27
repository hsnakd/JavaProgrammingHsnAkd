package day12_Scanner;
import java.util.*;


    public class Main {
        public static void main(String[] args) {
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

        }
    }

