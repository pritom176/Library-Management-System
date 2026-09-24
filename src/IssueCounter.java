import java.util.ArrayList;

public class IssueCounter {

    public void showCount(ArrayList<IssueRecord> records) {

        int totalTransactions = records.size();
        int totalReturned = 0;
        int currentlyIssued = 0;

        for (IssueRecord record : records) {

            if (record.getReturnDate() == null) {
                currentlyIssued++;
            } else {
                totalReturned++;
            }
        }

        System.out.println("Total Issue Transactions: " + totalTransactions);
        System.out.println("Currently Issued Books: " + currentlyIssued);
        System.out.println("Total Returned Books: " + totalReturned);
    }
}
