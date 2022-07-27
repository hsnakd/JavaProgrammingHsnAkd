package day04_Variables;

public class Currencies {

    public static void main(String[] args) {
        int dollar = 1000;
        double lira = 15;
        double euro = 0.95;
        double jpy = 114.14;
        double pound = 0.8;
        double cad = 0.95;

        double currency1 = dollar * lira;
        double currency2 = dollar * euro;
        double currency3 = dollar * jpy;
        double currency4 = dollar * pound;
        double currency5 = dollar * cad;




        System.out.println("currency1 = " + currency1 + " Turkish Liras");
        System.out.println("currency2 = " + currency2 + " Euros");
        System.out.println("currency2 = " + currency3 + " JPY");
        System.out.println("currency2 = " + currency4 + " Pounds");
        System.out.println("currency2 = " + currency5 + " CAD");



    }



}
