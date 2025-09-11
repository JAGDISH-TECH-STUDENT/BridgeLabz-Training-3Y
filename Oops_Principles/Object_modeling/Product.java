import java.util.*;

class Product {
    String productId;
    String name;
    double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    String orderId;
    Customer customer;
    List<Product> products = new ArrayList<>();

    Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    public String toString() {
        return "Order " + orderId + " by " + customer.name + ": " + products;
    }
}

class Customer {
    String customerId;
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
    }

    public String toString() {
        return name + " has placed " + orders.size() + " orders.";
    }
}


