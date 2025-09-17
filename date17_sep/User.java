package date17_sep;

abstract class User {
    String name;
    String address;
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract String getRole();
}
class Customer extends User {
    public Customer(String name, String address) {
        super(name, address);
    }

    @Override
    String getRole() {
        return "Customer";
    }
    void placeOrder() {
        System.out.println(name + " placed an order.");
    }
}
class Seller extends User {
    public Seller(String name, String address) {
        super(name, address);
    }

    @Override
    String getRole() {
        return "Seller";
    }
}
class Admin extends User {
    public Admin(String name, String address) {
        super(name, address);
    }

    @Override
    String getRole() {
        return "Admin";
    }
    
}
interface PaymentGateway{
    void pay(double amount);
    void refund( double amount); 
}
class UPIPayment implements PaymentGateway {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI ID: " + upiId);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI ID: " + upiId);
    }
}
class CreditCardPayment implements PaymentGateway{
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card: " + cardNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card: " + cardNumber);
    }
}
class WalletPayment implements PaymentGateway{
    String walletId;

    WalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Wallet ID: " + walletId);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Wallet ID: " + walletId);
    }
}




