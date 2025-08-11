import java.util.ArrayList;
import java.util.List;

abstract class Account {
    protected String accountHolder;
    protected double balance;
    protected List<String> transactionHistory;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Starting amount: ₹" + balance);
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolder + ":");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}