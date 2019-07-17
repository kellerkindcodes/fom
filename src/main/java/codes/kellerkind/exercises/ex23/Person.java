package codes.kellerkind.exercises.ex23;

/**
 * Parent klass with abstract methods.
 *
 * @author kellerkind.codes
 */
public abstract class Person {

    /**
     * ------ QUICK INFORMATION TO UNDERSTAND WHAT HAPPENS ------
     *
     *
     * With abstract methods you can force the person that has to implement the subclass to implement special logic
     * You know that every person has a name and the logic to get the name is always the same
     * BUUUTTT the way to get the firstname, lastname and address is different for each type of person
     *
     * -> So we force the person that implements the subclass to
     *    provide a 'special' way for  firstname, lastname and address
     *
     * -> And we have the getName() method that is always the same
     *    Because of that reason it stays in the parent class
     */



    /** Special way for firstname. */
    public abstract String getFirstName();

    /** Special way for lastname. */
    public abstract String getLastName();

    /** Special way for address. */
    public abstract Adresse getAddress();


    /**
     * This is the general method to get the name of a {@link Mitarbeiter} or {@link Kunde}. It is always the same.
     * We dont want to repeat code so it stays in this parent class.
     *
     * @return the name of a Person (f.e. a {@link Mitarbeiter} or {@link Kunde})
     */
    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
