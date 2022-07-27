package day10_NestedIf;

public class
Z_Loans {

    public static void main(String[] args) {

        int salary = 30000;
        int creditScore = 750;

        System.out.println( (salary > 60000 && creditScore > 650)? "Loan Approved" : "Loan Denied");


    }

}

/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise, print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */
