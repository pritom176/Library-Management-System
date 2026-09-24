public class Main {

    public static void main(String[] args) {

        BookManager manager = new BookManager();

        Book book = new Book("B01", "Java Programming", "Advance Java", "111");
        ReferenceBook ref = new ReferenceBook(
                "R01", "Computer Networks", "Database System", "222");

        // CREATE
        manager.addBook(book);
        manager.addBook(ref);

        // READ
        System.out.println("All Books:");
        manager.showBooks();

        // FIND
        System.out.println("\nFind Book:");
        System.out.println(manager.findBook("B01"));

        // UPDATE
        manager.updateBook("B01", "Advanced Java");

        System.out.println("\nAfter Update:");
        manager.showBooks();

        // POLYMORPHISM
        System.out.println("\nBorrowable:");
        System.out.println("Book: " + book.isBorrowable());
        System.out.println("Reference Book: " + ref.isBorrowable());

        // DELETE
        manager.deleteBook("B01");

        System.out.println("\nAfter Delete:");
        manager.showBooks();
    }
}