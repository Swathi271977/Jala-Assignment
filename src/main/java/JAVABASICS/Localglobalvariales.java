/**
* 5. Define the local and Global variables with the same name and print both variables and
 * understand the scope of the variables
 */
package JAVABASICS;

public class Localglobalvariales {
    // Global variable (instance variable)
        int value = 10;

        public void demonstrateScope() {
            // Local variable with the same name as the instance variable
            int value = 20;

            System.out.println("Local variable 'value': " + value); // Prints the local variable's value
            System.out.println("Global (instance) variable 'value': " + this.value); // Prints the instance variable's value
        }

        public static void main(String[] args) {
            Localglobalvariales example = new Localglobalvariales();
            example.demonstrateScope();
        }
    }

