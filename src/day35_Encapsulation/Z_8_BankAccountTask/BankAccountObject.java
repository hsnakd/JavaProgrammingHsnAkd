package day35_Encapsulation.Z_8_BankAccountTask;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccountClass bankAccount1 = new BankAccountClass("HsnAkd",1234567890,10000);
        System.out.println(bankAccount1);

        bankAccount1.withdraw(5000);
        System.out.println(bankAccount1);

        bankAccount1.deposit(7500);
        System.out.println(bankAccount1);


    }
}
