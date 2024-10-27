# Program-Language-hw3
Homework 3 will test your ability to apply object-oriented design principles in Java to a
simple programming assignment (It is simple in that there aren’t going to be any
methods longer than say, 10 lines of code, but there will be multiple code files). You are
to create a library management system implemented as designed.
### Implementation
The application will consist of 2 abstract classes: Book and Person. There will be 2
derived classes of books: Fiction and NonFiction. Additionally, there will be 2 derived
classes of Person: Staff and Member. Lastly, There is a Library class to hold and
manage books and people.
You don’t need to fill out the main method of your Java program. As long as the classes
and methods are implemented as described, that is sufficient.
As usual, you’re expected to test and document your code.

### Abstract Classes
## Book
- Book will consist of four fields:
  - title (string)
  - author (string)
  - ISBN (string)
  - is_checked_out (bool)<br>
- Book will contain two methods:
  - check_out() – mark the book as checked_out.
  - return_book() – mark the book as returned.
  - describe() – return a string indicating the type of book. This method will change functionality in the derived classes.
## Person
- Person will consist of two fields:
  - name (string)
  - id (string) – this will be interpreted as a staff ID or member ID based on the
  derived class
- Person will contain one method:
  - describe() – return a string indicating the type of book. This method will change functionality in the derived classes.
# Concrete Classes
## Member, derived from Person
Member does not contain extra methods, functions, or fields.
## Staff, derived from Person
- Staff adds two methods:
  - register_member(library, member) – adds a new member to the library.
  - register_book(library, book) – adds a new book to the library.
## Fiction, derived from Book
Fiction does not contain extra methods, functions, or fields.
## NonFiction, derived from Book
NonFiction does not contain extra methods, functions, or fields.
## Library
- Library will contain three fields:
  - books – list of books
  - members – list of members
  - staff – list of staff
- Library will contain five methods:
  - add_book(Book) – adds a new book to the library.
  - register_member(Member) adds a new member to the library.
  - List_books() – print a list of all books.
  - List_member() – print a list of all members.
  - List_staff() – print a list of all staff.



## How to run code
Run the code in the Main
