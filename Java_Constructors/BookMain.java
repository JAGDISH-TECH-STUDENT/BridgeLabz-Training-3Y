public class BookMain {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Clean Code", "Robert C. Martin", 599.0);

        defaultBook.displayInfo();
        System.out.println("-----");
        customBook.displayInfo();
    }
}

