package date17_sep;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initBalance = sc.nextDouble();

        System.out.print("Set your 4-digit PIN: ");
        int pin = sc.nextInt();

        BankAccount account = new BankAccount(accNum, initBalance, pin);
        System.out.println(" Account created successfully!\n");
        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    account.deposit(depositAmt);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;

                case 4:
                    System.out.println(" Thank you for using our bank system!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid option. Please try again.");
            }
        }
    }
}