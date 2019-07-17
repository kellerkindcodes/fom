package codes.kellerkind.exercises.ex23;

import java.util.List;

/**
 * Implementation to present a 'customer'.
 *
 * @author kellerkind.codes
 */
public class Kunde extends Person {

    // THIS IS DIFFERENT FOR AN CUSTOMER (AN EMPLOYEE  DOES NOT HAVE AN a bonussystem or discount)!!!!
    private List<Bonussystem> bonussystems;

    public Kunde(final List<Bonussystem> bonussystems) {
        this.bonussystems = bonussystems;
    }

    public List<Bonussystem> getBonussystems() {
        return this.bonussystems;
    }





    // THIS PART COMES FROM THE SUPER CLASS PERSON but needs a special implementation


    @Override
    public String getFirstName() {
        // here follows special logic for an employee first name
        return "CUSTOMER_FIRST";
    }

    @Override
    public String getLastName() {
        // here follow special logic for an employee last name
        return "CUSTOMER_LAST";
    }

    @Override
    public Adresse getAddress() {
        // special logic for the address of an employee
        return new Adresse("customer street", 42, 50000);
    }

}
