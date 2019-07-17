package codes.kellerkind.exercises.ex36;

import codes.kellerkind.exercises.Exercise;

import java.util.Scanner;

/**
 * This is the mapping class for the exercise 36.
 *
 * @author kellerkind.codes
 */
public class PrintInputString extends Exercise {


    @Override
    public void executeExercise() {
        final Scanner scanner = new Scanner(System.in);

        // first get the value that should be printed several times
        System.out.print("Insert a String that should be printed: ");
        final String theValue = scanner.next();

        System.out.print("Insert how often this String should be printed: ");
        final int howOften = scanner.nextInt();

        // NOTE: normally I would check if the given values are correct (not null and not empty and of the correct type)
        // but as there is nothing in the exercise I'll leave it out

        for(int index = 0; index < howOften; index++) {
            System.out.println(theValue);
        }

    }
}
