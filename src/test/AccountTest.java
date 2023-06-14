package test;

import domain.Account;

/**
 * Informal tests of the Account class.
 */
public class AccountTest {
    public static void main(String[] args) {
        var account = new Account("1234-5");

        account.deposit(100.0);
        System.out.println("Number: " + account.getNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(100.0);

        System.out.println("Balance: " + account.getBalance());

        // ERROR: Insuficient funds
        // account.withdrawal(300.0);

        // ERROR: negative withdrawal
        // account.withdrawal(-50.0);

        // ERROR: negative deposit
        // account.deposit(-30.0);
    }
}
