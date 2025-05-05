package section7classesobjectsintro;

/**
 * Represents a bank account with owner and balance
 */
public class BankAccount {
    private String owner;
    private int balance;

    /**
     * Creates a new bank account with the given owner and zero balance
     *
     * @param owner name of the account owner
     */
    public BankAccount(String owner) {
        this(owner, 0);
    }

    /**
     * Creates a new bank account with the given owner and initial balance
     *
     * @param owner   name of the account owner
     * @param balance initial account balance
     */
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    /**
     * Deposits the specified amount into the account
     *
     * @param amount amount to deposit (must be positive)
     */
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to deposit must be greater than 0");
        }
    }

    /**
     * Withdraws the specified amount from the account
     *
     * @param amount amount to withdraw (must be positive and not exceed balance)
     */
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Amount to withdraw must be greater than 0 and equal your balance.");
        }
    }

    /**
     * Returns the name of the account owner
     *
     * @return account owner's name
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Returns the current account balance
     *
     * @return current balance
     */
    public int getBalance() {
        return balance;
    }
}
