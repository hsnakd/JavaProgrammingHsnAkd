package day04_Variables;

public class SalaryCalculator {


public static void main(String[]args){

    int hourlyRate  = 50;
    int weeklyHours = 40;
    int salary = hourlyRate*weeklyHours;
    int salaryannual = hourlyRate * weeklyHours * 52;

    System.out.println("Salary : " + "$ " + salary + " in a week");
    System.out.println("Salary : " + "$ " + salaryannual + " in a year");

}



}
