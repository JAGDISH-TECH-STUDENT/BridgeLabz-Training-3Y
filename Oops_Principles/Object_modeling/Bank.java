import java.util.*;

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, String accountType) {
        customer.addAccount(new Account(this, accountType));
    }
}

class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account acc : accounts) {
            System.out.println("- " + acc.accountType + " at " + acc.bank.name);
        }
    }
}

class Account {
    Bank bank;
    String accountType;

    Account(Bank bank, String accountType) {
        this.bank = bank;
        this.accountType = accountType;
    }
}



