import java.util.ArrayList;

public class IssueManager {

    private ArrayList<IssueRecord> records = new ArrayList<>();

    public void issueBook(Book book, String memberName) {

        if (!book.isBorrowable()) {
            System.out.println("Error: " + book.getTitle() + " is a Reference Book and cannot be issued.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Error: Book is already issued.");
            return;
        }

        book.setAvailable(false);
        IssueRecord record = new IssueRecord(book, memberName);
        records.add(record);

        System.out.println("Book '" + book.getTitle() + "' issued successfully to " + memberName + ".");
    }

    public void returnBook(Book book) {

        for (IssueRecord record : records) {

            if (record.getBook().getId().equals(book.getId()) && record.getReturnDate() == null) {

                book.setAvailable(true);
                record.returnBook();

                System.out.println("Book '" + book.getTitle() + "' returned successfully.");
                return;
            }
        }

        System.out.println("Error: Book was not issued or already returned.");
    }

    public ArrayList<IssueRecord> getRecords() {
        return records;
    }
}
