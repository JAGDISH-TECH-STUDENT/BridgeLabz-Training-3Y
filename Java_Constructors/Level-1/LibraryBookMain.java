public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Mastery", "Herbert Schildt", 799.0);
        lb.display();
        lb.borrowBook();
        lb.borrowBook();
    }
}

