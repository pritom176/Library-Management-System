public class ReferenceBook extends Book {

    public ReferenceBook(String id, String title,
                         String author, String isbn) {

        super(id, title, author, isbn);
    }

    @Override
    public boolean isBorrowable() {
        return false;
    }

    @Override
    public String getType() {
        return "Reference Book";
    }
}
