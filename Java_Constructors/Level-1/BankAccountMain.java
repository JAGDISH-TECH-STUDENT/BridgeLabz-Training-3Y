public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SBIN123456", "Ravi Kumar", 15000);
        acc.display();
        acc.deposit(5000);
        acc.withdraw(3000);
        System.out.println("Updated Balance: " + acc.getBalance());

        SavingsAccount sa = new SavingsAccount("SBIN789012", "Priya Sharma", 20000, 4.5);
        sa.displaySavingsDetails();
    }
}
