package domain;

/**
 * An account with number and balance.
 * The class is immutable, because all properties
 * and setters are private.
 */
public class Account {
    private String number;
    private double balance;

    public Account(String number) {
        setNumber(number);
        setBalance(0.0);
    }

    /**
     * Account number
     * 
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Set the account number.
     * Must be at most 5 digits follwed by "-" and 
     * another digit or x.
     * @param number the account number
     */
    private void setNumber(String number) {
        if (!number.matches("\\d{1,5}-(\\d|x)")) {
            throw new IllegalArgumentException("Invalid account number");
        }
        this.number = number;
    }

    /**
     * Set the account balance (must not be negative)
     * 
     * @param balance non-negative amount
     */
    private void setBalance(double balance) {
        if (balance < 0) {
            throw new 
            IllegalArgumentException(
                "Balance must not be negative");
        }
        this.balance = balance;
    }

    /**
     * The account balance.
     * 
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposit an amount in the account.
     *  
     * @param amount the (non-negative) amount
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new 
            IllegalArgumentException(
                "Amount must not be negative");
        }
        this.balance += amount;
    }

    /**
     * Withdraw an amount from the account.
     *  
     * @param amount the (non-negative) amount
     */
    public void withdrawal(double amount) {
        if (amount < 0) {
            throw new 
            IllegalArgumentException(
                "Amount must not be negative");
        }
        if (amount > this.balance) {
            throw new 
            IllegalArgumentException(
                "Insufficient funds");
        }
        this.balance -= amount;
    }
}
