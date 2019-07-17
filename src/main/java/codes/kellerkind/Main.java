package codes.kellerkind;

import codes.kellerkind.exercises.Exercise;
import codes.kellerkind.exercises.ex7.HelloWorld;

/**
 * Staring main class.
 *
 * @author kellerkind.codes
 */
public class Main {

    /**
     * This method is the starting point of everything. I use this to instantiate classes/objects.
     *
     * @param args the arguments that can be passed via console like 'java Main.java param1 param2'
     */
    public static void main(String[] args) {
        final String firstArg = args[0];

        // check the first given argument if it is null or an empty string
        if(firstArg != null && !args.equals("")) {
            ParamToClassMapping.map(firstArg).executeExercise();
            return;
        }

        System.out.println("Please provide parameter for the given Exercise that should be executed");
    }

    enum ParamToClassMapping {
        HELLO_WORLD("HelloWorld") {

            @Override
            Exercise init() {
                return new HelloWorld();
            }
        };

        /**
         * The value of the param.
         */
        final String param;

        // constructor
        ParamToClassMapping(final String givenParam) {
            this.param = givenParam;
        }

        /**
         * This method woll map the given value of the parameter to the given {@link Exercise} that should be executed.
         *
         * @param param the given parameter value
         * @return a {@link Exercise} if the parameter can be mapped
         */
        static Exercise map(final String param) {
            for(final ParamToClassMapping mapping : ParamToClassMapping.values()) {
                if(mapping.paramValue().equals(param)) {
                    return mapping.init();
                }
            }
            return new Exercise();
        }

        private String paramValue() {
            return this.param;
        }

        /**
         * This is overridden in enums;
         * @return a {@link Exercise}
         */
        abstract Exercise init();
    }
}
