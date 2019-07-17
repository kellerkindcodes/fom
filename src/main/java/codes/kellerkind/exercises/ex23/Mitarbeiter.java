package codes.kellerkind.exercises.ex23;

/**
 * Implementation to present a 'employee'.
 *
 * @author kellerkind.codes
 */
public class Mitarbeiter extends Person {

    // THIS IS DIFFERENT FOR AN EMPLOYEE (A CUSTOMER DOES NOT HAVE AN AGE)!!!!
    private final String alter;


    public Mitarbeiter(final String alter) {
        this.alter = alter;
    }

    public String getAlter() {
        return this.alter;
    }





    // THIS PART COMES FROM THE SUPER CLASS PERSON but needs a special implementation


    @Override
    public String getFirstName() {
        // here follows special logic for an employee first name
        return "EMPLOYEE_FIRST";
    }

    @Override
    public String getLastName() {
        // here follow special logic for an employee last name
        return "EMPLOYEE_LAST";
    }

    @Override
    public Adresse getAddress() {
        // special logic for the address of an employee
        return new Adresse("employee street", 1, 10000);
    }

}
