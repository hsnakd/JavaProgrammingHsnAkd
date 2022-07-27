package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browser = "chrome";
        String result = "";

         boolean validBrowser =  browser == "chrome" || browser == "safari" || browser == "firefox"
                 || browser == "opera" || browser == "edge";


        if (validBrowser)  {
            if (browser == "chrome") {
                result = "chrome";
            } else if (browser == "safari") {
                result = "safari";
            } else if (browser == "firefox") {
                result = "firefox";
            } else if (browser == "opera") {
                result = "opera";
            } else {
                result = "edge";
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }




    }
}
/*	1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declear a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        3. if the browser name does not match with the valid browsers' names,
        out put should be: Invalid Browser Name

        Ex:
        String browser = "chrome";

        Output:
        Chrome Browser is selected

        Note: MUST use nested if

 */