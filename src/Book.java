public class Book extends LibraryEntity {

    private String author;
    private String isbn;
    private boolean available;

    public Book(String id, String title, String author, String isbn) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
        available = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isBorrowable() {
        return true;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        return getId() + " | " + getTitle() + " | "
                + author + " | " + isbn;
    }
}
