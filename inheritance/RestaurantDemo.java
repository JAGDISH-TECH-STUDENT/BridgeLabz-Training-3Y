package inheritance;
public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef = new Chef("Arjun", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Priya", 202, 5);

        chef.displayRole();
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayRole();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
