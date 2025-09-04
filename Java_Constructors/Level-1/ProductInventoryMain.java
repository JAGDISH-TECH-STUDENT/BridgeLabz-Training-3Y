public class ProductInventoryMain {
    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 55000);
        ProductInventory p2 = new ProductInventory("Mouse", 799);

        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}

