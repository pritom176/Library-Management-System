import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books = new ArrayList<>();

    // CREATE
    public void addBook(Book book) {
        books.add(book);
    }

    // READ
    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // FIND
    public Book findBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id))
                return book;
        }
        return null;
    }

    // UPDATE
    public boolean updateBook(String id, String newTitle) {
        Book book = findBook(id);

        if (book != null) {
            book.setTitle(newTitle);
            return true;
        }

        return false;
    }

    // DELETE
    public boolean deleteBook(String id) {
        Book book = findBook(id);

        if (book != null) {
            books.remove(book);
            return true;
        }

        return false;
    }
}
