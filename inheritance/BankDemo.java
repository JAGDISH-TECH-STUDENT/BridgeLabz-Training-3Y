package inheritance;

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 15000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 8000.0, 5000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000.0, 12);

        sa.displayAccountType();
        sa.displayDetails();
        System.out.println();

        ca.displayAccountType();
        ca.displayDetails();
        System.out.println();

        fda.displayAccountType();
        fda.displayDetails();
    }
}
