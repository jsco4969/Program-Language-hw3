public class NonFiction extends Book {
    // Constructor for NonFiction books, calls superclass constructor
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    // Method to return the type of book as "NonFiction"
    @Override
    public String describe() {
        return "NonFiction";
    }
}
