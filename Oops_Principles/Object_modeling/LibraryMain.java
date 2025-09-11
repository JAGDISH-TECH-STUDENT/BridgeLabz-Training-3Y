public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(book1);
        lib2.addBook(book2);
        lib2.addBook(book1);

        System.out.println("Books in " + lib1.name + ":");
        for (Book b : lib1.books) {
            System.out.println(b.title + " by " + b.author);
        }

        System.out.println("Books in " + lib2.name + ":");
        for (Book b : lib2.books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

