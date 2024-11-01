/**
 * Abstract class representing a book in the library.
 * Defines basic attributes like title, author, ISBN, and checkout status.
 */
public abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean is_checked_out;

    /**
     * Constructor to initialize book details.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.is_checked_out = false;
    }

    /**
     * Marks the book as checked out.
     */
    public void check_out() {
        this.is_checked_out = true;
    }

    /**
     * Marks the book as returned.
     */
    public void return_book() {
        this.is_checked_out = false;
    }

    /**
     * Abstract method to describe the type of book.
     *
     * @return The description of the book type.
     */
    public abstract String describe();
}

