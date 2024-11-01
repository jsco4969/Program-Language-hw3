import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library containing books, members, and staff.
 * Provides methods to manage library resources.
 */
public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    /**
     * Constructor to initialize library lists.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book to add.
     */
    public void add_book(Book book) {
        books.add(book);
    }

    /**
     * Registers a new member to the library.
     *
     * @param member The member to register.
     */
    public void register_member(Member member) {
        members.add(member);
    }

    /**
     * Adds a new staff member to the library.
     *
     * @param staffMember The staff member to add.
     */
    public void add_staff(Staff staffMember) {
        staff.add(staffMember);
    }

    /**
     * Prints a list of all books in the library.
     */
    public void list_books() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " - " + book.describe());
        }
    }

    /**
     * Prints a list of all members in the library.
     */
    public void list_members() {
        for (Member member : members) {
            System.out.println(member.name + " - " + member.describe());
        }
    }

    /**
     * Prints a list of all staff in the library.
     */
    public void list_staff() {
        for (Staff staffMember : staff) {
            System.out.println(staffMember.name + " - " + staffMember.describe());
        }
    }
}

