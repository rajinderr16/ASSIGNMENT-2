class Book {

    // Instance Variables
    int bookId;
    String title;
    String author;
    double price;

    // Static Variables
    static String libraryName;
    static int bookCount = 0;

    // Parameterized Constructor
    Book(int bookId, String title, String author, double price) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        bookCount++;
    }

    // Non-Static Method
    void displayBook() {

        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println();

    }

    // Static Method
    static void displayLibraryName() {

        System.out.println("Library Name : " + libraryName);

    }

    // Static Method
    static void displayBookCount() {

        System.out.println("Total Books Created : " + bookCount);

    }

}

public class Assignment2 {

    public static void main(String[] args) {

        // Set Library Name
        Book.libraryName = "Chitkara University Library";

        // Create Book Objects
        Book b1 = new Book(101, "Java Programming", "James Gosling", 650.0);

        Book b2 = new Book(102, "Clean Code", "Robert C. Martin", 799.0);

        Book b3 = new Book(103, "Effective Java", "Joshua Bloch", 899.0);

        // Display Book Details
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        // Display Library Name
        Book.displayLibraryName();

        // Display Total Books Created
        Book.displayBookCount();

    }

}