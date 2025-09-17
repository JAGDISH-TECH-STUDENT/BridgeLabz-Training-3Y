package date17_sep;

public class UserMain {
    public static void main(String[] args) {
        PaymentGateway pg1 = new UPIPayment("amit@upi");
        PaymentGateway pg2 = new CreditCardPayment("1234-5678-9012-3456");
        PaymentGateway pg3 = new WalletPayment("wallet_raj");

        pg1.pay(500.0);
        pg2.refund(250.0);
        pg3.pay(1000.0);
    }
}
