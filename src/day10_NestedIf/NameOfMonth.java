package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

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




    }
}
