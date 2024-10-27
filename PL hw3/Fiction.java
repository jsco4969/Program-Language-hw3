public class Fiction extends Book {
    // Constructor for Fiction books, calls superclass constructor
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    // Method to return the type of book as "Fiction"
    @Override
    public String describe() {
        return "Fiction";
    }
}
