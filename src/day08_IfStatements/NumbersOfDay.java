package day08_IfStatements;

public class NumbersOfDay {

    public static void main(String[] args) {

        int month = 10;

        boolean days31  = month ==1 ||  month ==3 ||  month ==5 ||  month ==7 ||  month ==8 ||  month ==10 ||  month ==12;
        boolean days30  = month ==4 ||  month ==6 ||  month ==9 ||  month ==11;
        boolean days28  = month ==2;    // boolean has28Days = !has31Days && !has30Days;


        if (days31) {
            System.out.println("31 Days");
        }
        if (days30) {
            System.out.println("30 Days");
        }
        if (days28) {
            System.out.println("28 Days");
        }


    }


}
