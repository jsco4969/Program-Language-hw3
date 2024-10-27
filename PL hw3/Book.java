public abstract class Book {
    // Fields for book title, author, ISBN, and checkout status
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean is_checked_out;

    // Constructor to initialize book details
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.is_checked_out = false; // Default to not checked out
    }

    // Method to mark the book as checked out
    public void check_out() {
        this.is_checked_out = true;
    }

    // Method to mark the book as returned
    public void return_book() {
        this.is_checked_out = false;
    }

    // Abstract method to describe the book type, implemented by subclasses
    public abstract String describe();
}
