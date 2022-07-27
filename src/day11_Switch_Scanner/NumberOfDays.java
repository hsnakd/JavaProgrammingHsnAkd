package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int year = 2000;
        int month = 2;

        switch (month){
            case 2:
            if (year % 4 == 0) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
                break;
     /*
            String result = "";
            case 2:
                result (year % 4 == 0) ? "29 days" : "28 days";
                break;
    */
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");

            default:
                System.out.println("Invalid");
        }



    }

}

/*
	4. NumberOfDays
            28 Days: 2
            30 days: 4, 6, 9, 11
            31 days: 1, 3, 5, 7, 8, 10, 12

            If(1~12){


            }else{
            Invalid
            }



 */