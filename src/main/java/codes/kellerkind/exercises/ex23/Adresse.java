package codes.kellerkind.exercises.ex23;

/**
 * DTO to hold the information of a address.
 *
 * @author kellerkind.codes
 */
public class Adresse {

    private final String street;
    private final int streetNumber;
    private final int postalCode;

    public Adresse(final String street, final int streetNumber, final int postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return this.street;
    }

    public int getStreetNumber() {
        return this.streetNumber;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    // this is the string representation of the address
    @Override
    public String toString() {
        return this.street + ", " + this.streetNumber + ", " + this.postalCode;
    }
}
