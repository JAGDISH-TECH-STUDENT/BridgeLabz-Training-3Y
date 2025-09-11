public class ProductMain {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Alice");
        Product product = new Product("P001", "Laptop", 1500.00);
        Order order = new Order("O001", customer);
        order.addProduct(product);
        customer.placeOrder(order);

        System.out.println(customer);
        System.out.println(order);
    }
}




