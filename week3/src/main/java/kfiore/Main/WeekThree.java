package Main;

import java.lang.reflect.Method;

/**
 * Printer class which prints type values
 */

class Printer {

    /**
     * printArray method below
     * @param array
     * @param <type>
     */

    public <type> void printArray(type[]array) {

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);

        }
    }
}

public class WeekThree {

    public static void main(String[] args) {

        /**
         * Creates printer class in main
         */

        Printer myPrinter = new Printer();

        /**
         * Creates both int and String arrays
         */

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        /**
         * Prints both int and String arrays
         */

        myPrinter.printArray( intArray );
        myPrinter.printArray( stringArray );

        /**
         * Method count begins at 0, should not exceed 1
         * Loops through all methods in Printer class, looks for method called printArray
         */

        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String methodName = method.getName();
            if (methodName.equals("printArray")) {
                count++;
            }
        }

        /**
         * If more than one method is found in Printer class, program will return error
         */

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
            assert count == 1;
        }
    }

}