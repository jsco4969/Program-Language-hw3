/**
 * Class representing a library member.
 * Extends the Person class.
 */
public class Member extends Person {

    /**
     * Constructor for Member.
     *
     * @param name The name of the member.
     * @param id The ID of the member.
     */
    public Member(String name, String id) {
        super(name, id);
    }

    /**
     * Describes the person type as "Member".
     *
     * @return "Member" as the person type.
     */
    @Override
    public String describe() {
        return "Member";
    }
}

