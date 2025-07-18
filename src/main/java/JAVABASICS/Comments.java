/**
* 3. Write a program for a Single line comment, multi-line and documentation comments.
 */
package JAVABASICS;

public class Comments {

        public static void main(String[] args) {
            // -------- Single‑line comment --------
            // Print a friendly greeting:
            System.out.println("Hello from CommentDemo!");

        /* -------- Multi‑line (block) comment --------
           The next statement is commented out to show that
           a block comment can disable multiple lines of code.

        // System.out.println("This line is temporarily disabled");
        */

            System.out.println("Good‑bye!");
        }

        /**
         * Adds two integers.
         *
         * @param a first operand
         * @param b second operand
         * @return the arithmetic sum of {@code a} and {@code b}
         */
        public static int add(int a, int b) {
            return a + b;   // inline single‑line comment
        }
    }


