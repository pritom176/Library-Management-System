import java.util.ArrayList;

public class IssueManager {

    private ArrayList<IssueRecord> records = new ArrayList<>();

    public void issueBook(Book book, String memberName) {

        if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setAvailable(false);

        IssueRecord record = new IssueRecord(book, memberName);
        records.add(record);

        System.out.println("Book issued successfully.");
    }

    public void returnBook(Book book) {

        for (IssueRecord record : records) {

            if (record.getBook() == book &&
                    record.getReturnDate() == null) {

                book.setAvailable(true);
                record.returnBook();

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book was not issued.");
    }

    public ArrayList<IssueRecord> getRecords() {
        return records;
    }
}
