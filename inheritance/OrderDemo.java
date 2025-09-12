package inheritance;
import java.time.LocalDate;
public class OrderDemo {
    public static void main(String[] args) {
        Order order1 = new Order("ORD001", LocalDate.of(2025, 9, 10));
        ShippedOrder order2 = new ShippedOrder("ORD002", LocalDate.of(2025, 9, 11), "TRK123456");
        DeliveredOrder order3 = new DeliveredOrder("ORD003", LocalDate.of(2025, 9, 12), "TRK654321", LocalDate.of(2025, 9, 15));

        System.out.println(order1.getOrderStatus()); // Output: Order placed
        System.out.println(order2.getOrderStatus()); // Output: Order shipped
        System.out.println(order3.getOrderStatus()); // Output: Order delivered
    }
}
