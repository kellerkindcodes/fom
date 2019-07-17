package codes.kellerkind.exercises.ex13;

import codes.kellerkind.exercises.Exercise;

/**
 * This is the answer for the question in exercise 13.
 *
 * @author kellerkind.codes
 */
public class Calculate extends Exercise {

    @Override
    public void executeExercise() {
        // it is null because it uses the integer conversion (means no conversion)
        System.out.println("1 / 5: " + 1 / 5);

        // it is 0.2 because it uses the double conversion
        System.out.println("1.0 / 5: " + 1.0 / 5 );
    }
}
