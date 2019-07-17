package codes.kellerkind.exercises.ex19;

import codes.kellerkind.exercises.Exercise;

/**
 * This class shows the variables of exercise 18.
 *
 * @author kellerkind.codes
 */
public class Variables extends Exercise {

    // This is called instance-variable because it is initialized during the instantiation of the class
    // new Variable() -> this variable gets its value
    private final String classVariable = "Klassenvariable / Instanzvariable";

    // This is called during the compilation and gets its value before this class is instantiated
    // You can call this without this new stuff like Variables.staticClassVariable
    private static final String staticClassVariable = "Statische Klassen variable";


    @Override
    public void executeExercise() {
        // local variable
        // this is a variable that can never be static
        // it is initialized during the method call and it lives just during the method is executed
        final String localVariable = "Lokale variable";
    }
}
