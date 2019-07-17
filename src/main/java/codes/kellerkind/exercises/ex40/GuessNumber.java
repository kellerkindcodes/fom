package codes.kellerkind.exercises.ex40;

import codes.kellerkind.exercises.Exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * This is the mapping class for the exercise 40.
 *
 * @author kellerkind.codes
 */
public class GuessNumber extends Exercise {

    // this will generate a number that can be guessed by the user it will be from 1-100 -> ((0 - 99) + 1)
    private int numberToGuess = new Random().nextInt(99) + 1;

    @Override
    public void executeExercise() {
        final Scanner scanner = new Scanner(System.in);

        boolean found = false;

        do {
            // get input
            System.out.print("Please insert a number: ");
            final String guessedValue = scanner.next();

            if(guessedValue.equals("exit") || guessedValue.equals("quit")) {
                return;
            }

            try {
                // get the value from the user
                final int parsedGuess = Integer.parseInt(guessedValue);
                if(numberToGuess == parsedGuess) {
                    System.out.println("Sie haben die Zahl gefunden -> es ist " + parsedGuess);
                    return;
                }

                // evaluate if the number is more or less then the given number
                final String moreOrLess = parsedGuess > this.numberToGuess ? "groesser" : "kleiner";
                System.out.println("Die eingegebene Zahl ist " + moreOrLess + " als die gesuchte Zahl");


                System.out.println("numberToGuess: " + this.numberToGuess + ", given number: " + parsedGuess);
            } catch (final  NumberFormatException e) {
                System.out.println("Can not read given number -> game will restart");
                // restart
                this.numberToGuess = new Random().nextInt(99) + 1;
                continue;
            }


        } while (!found);
    }
}
