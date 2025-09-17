package date16_sep.polymorphism.aggregation;
import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
    Book b1 = new Book("Java");
    Book b2 = new Book("Python");

    List<Book> books = new ArrayList<>();
    books.add(b1);
    books.add(b2);

    Library library = new Library(books);
    System.out.println("Library has books: " + library.books.size());
    }
}