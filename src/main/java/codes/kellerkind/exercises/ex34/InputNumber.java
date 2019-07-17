package codes.kellerkind.exercises.ex34;

import codes.kellerkind.exercises.Exercise;

import java.util.Scanner;

/**
 * This is the mapping class for the exercise 34.
 *
 * @author kellerkind.codes
 */
public class InputNumber extends Exercise {

    @Override
    public void executeExercise() {
        // this will add a prompt to the console:
        System.out.print("Please provide a number: ");
        final Scanner scanner = new Scanner(System.in);

        // I will grep the input value
        final String input = scanner.next();
        // first check if the input value is there or not an empty string
        if(input != null && !input.equals("")) {

            // SEE HERE: the parseInt method throws an NumberFormatException if it is not possible to make the
            // given String of the user to an integer value like 'zwei' (zwei can not be parsed to 2) and would
            // throw this exception
            // in the catch block I'll handle then the exception
            try {
                final int theParsedIntValue = Integer.parseInt(input);
                System.out.println("Ihre Zahl lautet: " + theParsedIntValue);
            } catch (final NumberFormatException e) {
                System.out.println("Ihre Eingabe war keine Zahl");
            }
        }
    }


}
