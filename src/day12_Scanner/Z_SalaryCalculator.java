package day12_Scanner;

import java.util.Scanner;

public class Z_SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your hourlyRate");
        double hourlyRate = input.nextDouble();

        System.out.println("how many hours do you work in a week");
        double weeklyHours = input.nextDouble();

        System.out.println("enter state tax rate ");
        double federalTaxRate = input.nextDouble();

        System.out.println("enter federal tax");
        int stateTaxRate = input.nextInt();




        double salary = hourlyRate * weeklyHours * 52; // 52 weeks in a year
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


    }
}



/*
3. Car:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax r (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */