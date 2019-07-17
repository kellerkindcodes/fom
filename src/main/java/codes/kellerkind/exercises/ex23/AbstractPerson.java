package codes.kellerkind.exercises.ex23;

import codes.kellerkind.exercises.Exercise;

import java.util.ArrayList;

/**
 * This is the mapping class for the exercise 23.
 *
 * @author kellerkind.codes
 */
public class AbstractPerson extends Exercise {

    @Override
    public void executeExercise() {
        final Mitarbeiter ma = new Mitarbeiter("30");
        System.out.println("The employee name: " + ma.getName());
        System.out.println("The employee adress: " + ma.getAddress());
        // special field in employee
        System.out.println("The employee age: " + ma.getAlter());




        // the bonussystem is not relevant for the exercise -> just to complete this example <3
        final Bonussystem testBonus = new Bonussystem("test-bonus-of-a-customer-10%");
        final ArrayList<Bonussystem> bonusList = new ArrayList<>();
        bonusList.add(testBonus);


        final Kunde kunde = new Kunde(bonusList);

        System.out.println("The customer name: " + kunde.getName());
        System.out.println("The customer adress: " + kunde.getAddress());
        // special field for customer -> just for this example
        System.out.println("The bonus: " + kunde.getBonussystems().get(0).getName());
    }
}
