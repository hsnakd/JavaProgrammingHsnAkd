package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {


    char operator = '+';
    boolean calculator = operator == '+' || operator == '-' || operator == '*' || operator == '/';
    double n1 = 5.5;
    double n2 = 5.5;

        if (calculator) {
            switch (operator){
                case '+':
                    System.out.println(n1 + n2);
                   break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;
            }
        } else {
            System.out.println("Invalid");
        }

    }
}
