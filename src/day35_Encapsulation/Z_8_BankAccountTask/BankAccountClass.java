package day35_Encapsulation.Z_8_BankAccountTask;

public class BankAccountClass {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccountClass(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double amount){ // -1
        if(amount <= 0){
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(1);
        }

        System.out.println("Depositing $" + amount + " to the account " + accountNumber);
        balance += amount;
    }


    public void withdraw(double amount){
        if(amount <= 0){
            System.err.println("Withdrawing amount can not be negative or zero");
            System.exit(0);
        }

        if(balance <= 0){
            System.err.println("Insufficient balance");
            System.exit(0);
        }
        System.out.println("Withdrawing $" + amount + " from the account "+accountNumber);
        balance -= amount;
    }


    public String toString() {
        return "BankAccountClass{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

/*
8. BankAccountTask:*
    Create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkBalance()
                toString()

            DO NOT duplicate any code fragments


 */