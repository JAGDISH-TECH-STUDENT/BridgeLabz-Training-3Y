public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("978-3-16-148410-0", "Java Basics", "James Gosling");
        b1.display();
        b1.setAuthor("Oracle Inc.");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch", 5.2);
        eb.displayEBookDetails();
    }
}
