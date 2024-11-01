/**
 * Class representing a staff member in the library.
 * Extends the Person class.
 */
public class Staff extends Person {

    /**
     * Constructor for Staff.
     *
     * @param name The name of the staff member.
     * @param id The ID of the staff member.
     */
    public Staff(String name, String id) {
        super(name, id);
    }

    /**
     * Describes the person type as "Staff".
     *
     * @return "Staff" as the person type.
     */
    @Override
    public String describe() {
        return "Staff";
    }

    /**
     * Registers a new member in the library.
     *
     * @param library The library where the member will be registered.
     * @param member The member to register.
     */
    public void register_member(Library library, Member member) {
        library.register_member(member);
    }

    /**
     * Registers a new book in the library.
     *
     * @param library The library where the book will be added.
     * @param book The book to add.
     */
    public void register_book(Library library, Book book) {
        library.add_book(book);
    }
}

