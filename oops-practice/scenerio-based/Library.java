import java.util.*;

// Custom exception
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

// Book class
class Book {
    String title;
    String author;
    boolean isAvailable = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    static List<Book> bookList = new ArrayList<>();

    // Add book
    static void addBook(Book book) {
        bookList.add(book);
    }

    // Search book by partial title
    static void searchBook(String keyword) {
        for (Book b : bookList) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author);
            }
        }
    }

    // Checkout book
    static void checkoutBook(String title)
            throws BookNotAvailableException {

        for (Book b : bookList) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isAvailable) {
                    throw new BookNotAvailableException(
                        "Book already issued");
                }
                b.isAvailable = false;
                System.out.println("Book issued successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) {
        try {
            addBook(new Book("Java Programming", "James Gosling"));
            addBook(new Book("Python Basics", "Guido"));

            searchBook("Java");
            checkoutBook("Java Programming");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
