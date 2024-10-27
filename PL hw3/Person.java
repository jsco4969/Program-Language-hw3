public abstract class Person {
    // Fields for person's name and ID
    protected String name;
    protected String id;

    // Constructor to initialize person's details
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to describe the person type, implemented by subclasses
    public abstract String describe();
}
