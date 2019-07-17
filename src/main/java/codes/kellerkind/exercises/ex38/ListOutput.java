package codes.kellerkind.exercises.ex38;

import codes.kellerkind.exercises.Exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the mapping class for the exercise 38.
 *
 * @author kellerkind.codes
 */
public class ListOutput extends Exercise {

    // hold the strings
    // NOTE: the final is just for the list not for the content
    private final List<String> strings = new ArrayList<>(5);


    // the constructor adds values to the string list
    public ListOutput() {
        this.strings.add("one");
        this.strings.add("two");
        this.strings.add("three");
        this.strings.add("four");
        this.strings.add("five");
    }



    @Override
    public void executeExercise() {
        // remove the third entry
        this.strings.remove(2);

        // check if the third entry was removed -> is still there
        if(this.strings.contains("three")) {
            System.out.println("The entry is still there!!!");
            // stop the application
            return;
        }

        // print size and content of the list
        System.out.println("Size of the list: " + this.strings.size());
        for(final String entry : this.strings) {
            System.out.println("Contained entry: " + entry);
        }
    }
}
