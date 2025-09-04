public class EBook extends Book {
    double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("EBook: " + title + " [" + ISBN + "], Size: " + fileSizeMB + "MB");
    }
}

