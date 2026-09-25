package librarymanagement.reports;

import java.util.List;

public class ReportManager {

    // Generate a general report
    public static void generateReport(String title, List<?> records) {

        System.out.println("\n=================================");
        System.out.println(title);
        System.out.println("=================================");

        if (records == null || records.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        for (Object record : records) {
            System.out.println(record);
        }

        System.out.println("---------------------------------");
        System.out.println("Total Records: " + records.size());
        System.out.println("=================================");
    }

    // Generate book report
    public static void generateBookReport(List<?> books) {
        generateReport("BOOK REPORT", books);
    }

    // Generate member report
    public static void generateMemberReport(List<?> members) {
        generateReport("MEMBER REPORT", members);
    }

    // Generate issue and return report
    public static void generateIssueReport(List<?> issueRecords) {
        generateReport("ISSUE / RETURN REPORT", issueRecords);
    }

    // Generate summary report
    public static void generateSummaryReport(
            List<?> books,
            List<?> members,
            List<?> issueRecords) {

        System.out.println("\n=================================");
        System.out.println("LIBRARY MANAGEMENT SUMMARY");
        System.out.println("=================================");

        int bookCount = books == null ? 0 : books.size();
        int memberCount = members == null ? 0 : members.size();
        int issueCount = issueRecords == null ? 0 : issueRecords.size();

        System.out.println("Total Books       : " + bookCount);
        System.out.println("Total Members     : " + memberCount);
        System.out.println("Total Issue Records: " + issueCount);

        System.out.println("=================================");
    }
}
