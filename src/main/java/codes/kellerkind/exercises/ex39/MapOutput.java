package codes.kellerkind.exercises.ex39;

import codes.kellerkind.exercises.Exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the mapping class for the exercise 39.
 *
 * @author kellerkind.codes
 */
public class MapOutput extends Exercise {

    final Map<Integer, String> values = new HashMap<>(5);

    public MapOutput() {
        // Auto-Boxing means automatic cast from int 1 to wrapper class Integer 1
        this.values.put(1, "One");
        this.values.put(2, "Two");
        this.values.put(3, "Three");

        // here without Auto-Boxing
        this.values.put(Integer.valueOf(4), "Four");
        this.values.put(Integer.valueOf(5), "Five");
    }

    @Override
    public void executeExercise() {
        // remove the third entry
        this.values.remove(Integer.valueOf(3));

        // check if the third entry was removed -> is still there
        if(this.values.containsKey(Integer.valueOf(3))) {
            System.out.println("The entry is still there!!!");
            // stop the application
            return;
        }

        // print size and content of the list
        System.out.println("Size of the list: " + this.values.size());
        for(final Map.Entry entry : this.values.entrySet()) {
            System.out.println("Contained entry key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
