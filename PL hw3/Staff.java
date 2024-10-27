public class Staff extends Person {
    // Constructor for Staff, calls superclass constructor
    public Staff(String name, String id) {
        super(name, id);
    }

    // Method to return the type of person as "Staff"
    @Override
    public String describe() {
        return "Staff";
    }

    // Method to register a new member in the library
    public void register_member(Library library, Member member) {
        library.register_member(member);
    }

    // Method to register a new book in the library
    public void register_book(Library library, Book book) {
        library.add_book(book);
    }
}
