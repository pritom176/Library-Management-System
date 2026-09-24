import java.time.LocalDate;

public class IssueRecord {

    private Book book;
    private String memberName;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public IssueRecord(Book book, String memberName) {
        this.book = book;
        this.memberName = memberName;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }

    public Book getBook() {
        return book;
    }

    public String getMemberName() {
        return memberName;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}
