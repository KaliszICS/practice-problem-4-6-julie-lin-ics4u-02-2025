import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings;

    /**
     * Main Constructor for the Person class.
     * Initializes a new Person object with all their personal details.
     *
     * @param firstname The first name of the person.
     * @param lastName The last name of the person.
     * @param birthDay The day of person's birth.
     * @param birthMonth The month of person's birth.
     * @param birthYear The year of person's birth.
     * @param ssn The person's Social Security Number.
     */
    public Person (String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }
    /**
     * Returns the first name of the person.
     * @return The first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the first name of the person.
     * @param firstname The new first name.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns the last name of the person.
     * @return The last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the person.
     * @param lastname The new last name.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the person's birthday in "day/month/year" format.
     * @return A String representing the birthday.
     */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    /**
     * Adds a given Person object as a sibling to this person.
     * @param sibling The Person object to add as a sibling.
     */
    public void addSibling(Person sibling) {
        Person[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
        newSiblings[newSiblings.length - 1] = sibling;
        this.siblings = newSiblings;
        this.numberOfSiblings++;
    }

    /**
     * Returns an array of Person objects that are siblings of this person.
     * @return An array of siblings.
     */
    public Person[] getSiblings() {
        return Arrays.copyOf(this.siblings, this.siblings.length);
    }

    public String getSsn() {
        return ssn;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }
}
    
    