package day31_Constructors.Z_1_SalaryCalculator;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator object1 = new SalaryCalculator(100,10,20, 45);
        System.out.println(object1);


    }
}

/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object



 */