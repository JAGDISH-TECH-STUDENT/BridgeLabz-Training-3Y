
public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Wings of Fire";
        this.author = "A.P.J. Abdul Kalam";
        this.price = 250.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println(" Title: " + title);
        System.out.println(" Author: " + author);
        System.out.println(" Price: " + price);
    }
}

