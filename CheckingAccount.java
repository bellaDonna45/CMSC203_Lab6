package bankaccountpackage;

public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15;

    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        // Modify the accountNumber using a mutator method
        setAccountNumber(getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount) {
        // Add the fee to the amount to withdraw
        double amountWithFee = amount + FEE;
        // Call the superclass withdraw method and return its result
        return super.withdraw(amountWithFee);
    }
}

