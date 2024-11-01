/**
 * Class representing a NonFiction book.
 * Extends the Book class.
 */
public class NonFiction extends Book {

    /**
     * Constructor for NonFiction books.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    /**
     * Describes the book type as "NonFiction".
     *
     * @return "NonFiction" as the book type.
     */
    @Override
    public String describe() {
        return "NonFiction";
    }
}

