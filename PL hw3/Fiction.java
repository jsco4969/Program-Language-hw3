/**
 * Class representing a Fiction book.
 * Extends the Book class.
 */
public class Fiction extends Book {

    /**
     * Constructor for Fiction books.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    /**
     * Describes the book type as "Fiction".
     *
     * @return "Fiction" as the book type.
     */
    @Override
    public String describe() {
        return "Fiction";
    }
}
