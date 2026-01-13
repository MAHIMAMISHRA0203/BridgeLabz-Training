/******************************************************************************

                    Online Java Compiler
*******************************************************************************/

// ---------- Custom Exception ----------
class InsufficientBalance extends Exception {
    public InsufficientBalance(String note) {
        super(note);
    }
}

// ---------- Abstraction ----------
interface TransferService {
    void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalance;
}

// ---------- Bank Transfer ----------
class BankTransfer implements TransferService {

    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalance {

        from.withdraw(amount);
        to.addMoney(amount);
        System.out.println("Bank Transfer Successful");
    }
}

// ---------- Wallet Transfer ----------
class WalletTransfer implements TransferService {

    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalance {

        from.withdraw(amount);
        to.addMoney(amount);
        System.out.println("Wallet Transfer Successful");
    }
}

// ---------- Wallet ----------
class Wallet {
    double balance;
    String id;

    Wallet(double balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    void withdraw(double amount) throws InsufficientBalance {
        if (amount > balance) {
            throw new InsufficientBalance("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Money withdrawn");
    }

    void addMoney(double amount) {
        balance += amount;
        System.out.println("Money added");
    }
}

// ---------- User ----------
class User {
    String name;
    String id;
    Wallet wallet;

    User(String name, String id, double initialBalance) {
        this.name = name;
        this.id = id;
        this.wallet = new Wallet(initialBalance, id + "_wallet");
    }
}

// ---------- Transaction ----------
class Transaction {
    String tType;

    Transaction(String tType) {
        this.tType = tType;
    }

    void show() {
        System.out.println("Transaction type: " + tType);
    }
}

// ---------- Main ----------
public class Main {
    public static void main(String[] args) {

        User u1 = new User("Mahima Mishra", "U101", 5000);
        User u2 = new User("Aman", "U102", 2000);

        TransferService transfer = new BankTransfer();

        try {
            transfer.transfer(u1.wallet, u2.wallet, 2000);
            System.out.println("U1 Balance: " + u1.wallet.balance);
            System.out.println("U2 Balance: " + u2.wallet.balance);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }

        Transaction t = new Transaction("Bank Transfer");
        t.show();
    }
}
