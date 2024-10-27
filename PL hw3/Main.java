public class Main {
    public static void main(String[] args) {
        // Create a new library instance
        Library library = new Library();

        // Create a new staff member and add to library
        Staff staff1 = new Staff("Mira", "S001");
        library.add_staff(staff1);

        // Create a new member and register to library
        Member member1 = new Member("Ron", "M001");
        staff1.register_member(library, member1);

        // Create new books and register to library
        Book book1 = new Fiction("1984", "George Orwell", "123456789");
        staff1.register_book(library, book1);

        Book book2 = new NonFiction("Sapiens", "Yuval Noah Harari", "987654321");
        staff1.register_book(library, book2);

        // Print all books in the library
        System.out.println("Books in library:");
        library.list_books();

        // Print all members in the library
        System.out.println("\nMembers in library:");
        library.list_members();

        // Print all staff in the library
        System.out.println("\nStaff in library:");
        library.list_staff();
    }
}
