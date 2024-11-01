/**
 * Abstract class representing a person in the library system.
 * Defines basic attributes like name and ID.
 */
public abstract class Person {
    protected String name;
    protected String id;

    /**
     * Constructor to initialize person details.
     *
     * @param name The name of the person.
     * @param id The ID of the person.
     */
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Abstract method to describe the person type.
     *
     * @return The description of the person type.
     */
    public abstract String describe();
}
