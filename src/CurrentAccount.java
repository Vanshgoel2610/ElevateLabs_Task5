class CurrentAccount extends Account {
    private final double overdraftLimit;

    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + String.format("₹%.2f", amount));
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Overriding withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            transactionHistory.add("Current Account Withdrawal: ₹" + amount);
            System.out.println("₹" + amount + " withdrawn successfully (Overdraft allowed).");
        } else {
            System.out.println("Withdrawal failed: Overdraft limit exceeded.");
        }
    }
}