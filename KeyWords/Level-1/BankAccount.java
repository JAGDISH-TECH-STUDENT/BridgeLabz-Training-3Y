import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setBankName(String newBankName) {
        bankName = newBankName;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: $" + amount);
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println(this);
        System.out.println("Transaction History:");
        for (String entry : transactionHistory) {
            System.out.println(" - " + entry);
        }
    }

    @Override
    public String toString() {
        return "Bank Name: " + bankName +
               "\nAccount Holder: " + accountHolderName +
               "\nAccount Number: " + accountNumber +
               "\nBalance: $" + balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}

