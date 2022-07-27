package day09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int day = 7;

        if (day==1) {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please, enter a value day number");
        }


        System.out.println("--------------------------------------------------");

        int number = 5;
        String dayName = "";



        if (number==1) {
            dayName = "Monday";
        } else if (number==2) {
            dayName = "Tuesday";
        } else if (number==3) {
            dayName = "Wednesday";
        } else if (number==4) {
            dayName = "Thursday";
        } else if (number==5) {
            dayName = "Friday";
        } else if (number==6) {
            dayName = "Saturday";
        } else if (number==7) {
            dayName = "Sunday";
        } else {
            System.out.println("Please, enter a value day number");
        }
        System.out.println(dayName);


        System.out.println("--------------------------------------------------");






        int days = 1;

        boolean Monday     = days == 1;
        boolean Tuesday    = days ==2;
        boolean Wednesday  = days ==3;
        boolean Thursday   = days ==4;
        boolean Friday     = days ==5;
        boolean Saturday   = days ==6;
        boolean Sunday     = days ==7;


        if (Monday) {
            System.out.println("Monday");
        }
        if (Tuesday) {
            System.out.println("Tuesday");
        }
        if (Wednesday) {
            System.out.println("Wednesday");
        }
        if (Thursday) {
            System.out.println("Thursday");
        }
        if (Friday) {
            System.out.println("Friday");
        }
        if (Saturday) {
            System.out.println("Saturday");
        }
        if (Sunday) {
            System.out.println("Sunday");
        }


        System.out.println("--------------------------------------------------");


    }

}
