import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IssueDuration {

    public long calculateDays(IssueRecord record) {

        LocalDate startDate = record.getIssueDate();
        LocalDate endDate;

        if (record.getReturnDate() == null) {
            endDate = LocalDate.now();
        } else {
            endDate = record.getReturnDate();
        }

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public void showDuration(IssueRecord record) {

        long days = calculateDays(record);

        System.out.println("Member Name: " + record.getMemberName());
        System.out.println("Book Title: " + record.getBook().getTitle());
        System.out.println("Total Duration: " + days + " days");
    }
}
