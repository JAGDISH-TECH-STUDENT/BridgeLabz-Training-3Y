package date17_sep;
import java.util.Scanner;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private final int pin; 

    
    public BankAccount(String accountNumber, double initialBalance,int pin) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, initialBalance); 
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount);
        } else {
            System.out.println(" Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount);
        }
    }
}
