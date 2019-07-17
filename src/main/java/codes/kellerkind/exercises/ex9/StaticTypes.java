package codes.kellerkind.exercises.ex9;

import codes.kellerkind.exercises.Exercise;

/**
 * This exercise shows what static variables and methods are and how they behave.
 *
 * @author kellerkind.codes
 */
public class StaticTypes extends Exercise {


    @Override
    public void executeExercise() {

        // NO initialization -> Note the age is 42
        System.out.println(PersonA.age);
        System.out.println(PersonA.name());

        // NO initialization -> Not the age is 30  and NOT 42 !!!!
        System.out.println(PersonB.age);
        System.out.println(PersonB.name());


        // initialize
        final PersonB personB = new PersonB();
        // no the 'doSomething method can be called' because it is not static and we need the new here
        personB.doSomething();

        // we can override the 42 in PersonA with 30 in PersonB!!!!!
        final PersonA  overriddenPersonA = new PersonB(); // this is working because PersonB extends PersonA
        System.out.println("Overridden age in person a: " + overriddenPersonA.age);
    }

}
