import java.util.ArrayList;
import java.util.List;

public class Library {
    // List to store books, members, and staff
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    // Constructor to initialize lists
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void add_book(Book book) {
        books.add(book);
    }

    // Method to register a new member to the library
    public void register_member(Member member) {
        members.add(member);
    }

    // Method to add a new staff member to the library
    public void add_staff(Staff staffMember) {
        staff.add(staffMember);
    }

    // Method to print a list of all books in the library
    public void list_books() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " - " + book.describe());
        }
    }

    // Method to print a list of all members in the library
    public void list_members() {
        for (Member member : members) {
            System.out.println(member.name + " - " + member.describe());
        }
    }

    // Method to print a list of all staff in the library
    public void list_staff() {
        for (Staff staffMember : staff) {
            System.out.println(staffMember.name + " - " + staffMember.describe());
        }
    }
}

