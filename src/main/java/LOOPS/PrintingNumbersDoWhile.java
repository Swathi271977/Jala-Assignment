/**
 * 7. Write a program to print 1 to 10 using the do-while loop statement.
 */
package LOOPS;

public class PrintingNumbersDoWhile {


        public static void main(String[] args) {
            int i = 1; // Initialize the counter variable

            do {
                System.out.println(i); // Print the current value of i
                i++; // Increment i for the next iteration
            } while (i <= 10); // Condition to continue the loop
        }
    }

