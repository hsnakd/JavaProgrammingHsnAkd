package day31_Constructors.Z_1_SalaryCalculator;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

// displays the salary, stateTax, federalTax, salaryAfterTax of the Object
    public String toString() {
        return "SalaryCalculator{" +
                "Salary = " + salary() +
                ", State Tax = " + stateTax() +
                ", Federal Tax = " + federalTax() +
                ", Salary After Tax() = " + salaryAfterTax() +
                ", hourlyRate = " + hourlyRate +
                ", stateTaxRate = " + stateTaxRate +
                ", federalTaxRate = " + federalTaxRate +
                ", weeklyHours = " + weeklyHours +
                '}';
    }
}




/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHours * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object



 */