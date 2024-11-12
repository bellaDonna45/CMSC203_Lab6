package bankaccountpackage;

public class SavingsAccount extends BankAccount {
    private static final double RATE = 0.025; // Annual interest rate of 2.5%
    private int savingsNumber = 0; // Unique identifier for each savings account
    private String accountNumber; // Hides the accountNumber in the superclass

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        // Initialize accountNumber with the superclass accountNumber and the savingsNumber
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        // Calculate monthly interest
        double monthlyInterest = getBalance() * (RATE / 12);
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor to create another savings account for the same person
    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        this.savingsNumber = originalAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}

