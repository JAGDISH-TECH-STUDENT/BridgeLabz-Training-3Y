package inheritance;
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; 

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
