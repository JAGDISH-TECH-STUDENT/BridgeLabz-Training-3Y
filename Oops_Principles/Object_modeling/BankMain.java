public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Customer cust1 = new Customer("Alice");

        bank1.openAccount(cust1, "Savings");
        bank1.openAccount(cust1, "Checking");

        cust1.viewBalance();
    }
}
