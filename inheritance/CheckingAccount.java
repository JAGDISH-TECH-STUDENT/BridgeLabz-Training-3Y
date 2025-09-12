package inheritance;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
