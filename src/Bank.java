public class Bank {
    public static void main(String[] args) {
        // Savings Account Demo
        SavingsAccount savings = new SavingsAccount("Vansh Goel", 5000, 5);
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.addInterest();
        savings.withdraw(6000); // should fail due to min balance rule
        savings.printTransactionHistory();
        System.out.println("Final Savings Balance: ₹" + savings.getBalance());

        System.out.println("\n-----------------------------\n");

        // Current Account Demo
        CurrentAccount current = new CurrentAccount("Vansh Goel", 3000, 2000);
        current.deposit(1500);
        current.withdraw(4000); // overdraft used
        current.withdraw(500);
        current.withdraw(500);
        current.withdraw(500);
        current.withdraw(500);
        current.withdraw(500);
        current.withdraw(2000); // overdraft exceeded
        current.printTransactionHistory();
        System.out.println("Current Balance: " + current.getBalance());
        current.deposit(2000);
        System.out.println("Final Current Balance: " + current.getBalance());
    }
}