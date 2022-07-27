package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------");

        int number = 5;
        String month ="";

        if (number >=1 && number <=12) {
            if (number == 1) {
                month = "Jan";
            } else if (number == 2) {
                month = "Feb";
            } else if (number == 3) {
                month = "Mar";
            } else if (number == 4) {
                month = "Apr";
            } else if (number == 5) {
                month = "May";
            } else if (number == 6) {
                month = "Jun";
            } else if (number == 7) {
                month = "Jul";
            } else if (number == 8) {
                month = "Aug";
            } else if (number == 9) {
                month = "Sep";
            } else if (number == 10) {
                month = "Oct";
            } else if (number == 11) {
                month = "Nov";
            } else {
                month = "Dec";
            }

        }else {
            month = "Invalid";
        }

        System.out.println(month);
        System.out.println("------------------------------------------------");

        System.out.println( (number == 1) ? "JAN" : (number == 2) ? "FEB" : (number == 3) ? "MAR" : (number == 4) ? "APR" : (number == 5) ? "MAY" : (number == 6) ? "JUN" : (number == 7) ? "JUL" :(number == 8) ? "AUG" : (number == 9) ? "SEP" : (number == 10) ? "OCT" : (number == 11) ? "NOV" : "DEC"      );


        System.out.println("------------------------------------------------");




    }

}
