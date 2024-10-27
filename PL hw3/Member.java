public class Member extends Person {
    // Constructor for Member, calls superclass constructor
    public Member(String name, String id) {
        super(name, id);
    }

    // Method to return the type of person as "Member"
    @Override
    public String describe() {
        return "Member";
    }
}
