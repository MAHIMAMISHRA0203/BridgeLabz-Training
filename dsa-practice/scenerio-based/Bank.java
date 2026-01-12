/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * 
 *******************************************************************************/

interface BankService {
    int checkBalance();

    void deposit(int money);

    void withdraw(int money) throws InsufficientBalanceException;

    double interestCalculation();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class Account implements BankService {
    protected String name;
    protected int amount;
    protected String accountNumber;

    Account(String name, int amount, String accountNumber) {
        this.name = name;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public int checkBalance() {
        return amount;
    }
}

class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    SavingsAccount(String name, int amount, String accountNumber) {
        super(name, amount, accountNumber);
    }

    public void deposit(int money) {
        amount += money;
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(int money) throws InsufficientBalanceException {
        if (money > amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        amount -= money;
        System.out.println("Amount withdrawn successfully");
    }

    public double interestCalculation() {
        return INTEREST_RATE;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String name, int amount, String accountNumber) {
        super(name, amount, accountNumber);
    }

    public void deposit(int money) {
        amount += money;
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(int money) throws InsufficientBalanceException {
        if (money > amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        amount -= money;
        System.out.println("Amount withdrawn successfully");
    }

    public double interestCalculation() {
        return 0.0;
    }
}

public class Bank {
    public static void main(String[] args) {

        BankService account = new SavingsAccount(
                "Mahima Mishra", 1000, "EF78FY78F");

        account.deposit(500);

        try {
            account.withdraw(200);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + account.checkBalance());
        System.out.println("Interest Rate: " + account.interestCalculation() + "%");
    }
}
