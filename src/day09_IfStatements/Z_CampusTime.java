package day09_IfStatements;

public class Z_CampusTime {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int hour = 2;

        if (hour >=8 && hour < 23) {
            System.out.println("Open");
        } else if ((hour >=23 && hour <=24) || (hour >=0 && hour < 8)) {
            System.out.println("Close");
        } else {
            System.out.println("Entered invalid hour");
        }

        System.out.println("--------------------------------------------------");

    }

}
/*
Create a class called CampusTime, an integer variable named time is given with a
number between 1~24 has been initialized, write a program that can find out if
the campus is open or not. Campus is open from 8 am(8) to 11 pm (23)
If user enters a time within the open time they should see message: “open”
but if the time entered is out side of operating hours they should see: “ closed”.

 */