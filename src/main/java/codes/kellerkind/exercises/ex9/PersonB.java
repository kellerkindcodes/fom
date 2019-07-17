package codes.kellerkind.exercises.ex9;

/**
 * Person A that is 30 years old.
 *
 * @author kellerkind.codes
 */
public class PersonB extends PersonA {

    /** The age that is static. Means it is here to compile time not after initializing this class! */
    public static int age = 30;

    /**
     * Static method that needs no initialization of the class -> can be called directly!
     *
     * @return a name
     */
    public static String name() {
        return "Tommy";
    }

    /**
     * Non static method.
     */
    public void doSomething() {
        // some logic (not needed for now)
    }
}
