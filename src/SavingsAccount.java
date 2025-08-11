class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Overriding withdraw method to include min balance rule
    @Override
    public void withdraw(double amount) {
        double minBalance = 2000; // Min balance requirement
        if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
            transactionHistory.add("Savings Account Withdrawal: ₹" + amount);
            System.out.println("₹" + amount + " withdrawn successfully from Savings Account.");
        } else {
            System.out.println("Withdrawal failed: Maintain minimum balance of ₹" + minBalance);
        }
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        transactionHistory.add("Interest added: ₹" + interest);
        System.out.println("Interest of ₹" + interest + " added.");
    }
}