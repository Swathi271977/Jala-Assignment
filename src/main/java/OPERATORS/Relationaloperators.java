/**
 * 6. Program for relational operators (<,<==, >, >==)
 */
package OPERATORS;

public class Relationaloperators {


        public static void main(String[] args) {
            int num1 = 15;
            int num2 = 10;
            int num3 = 15;

            // Less than (<) operator
            System.out.println("num1 < num2: " + (num1 < num2)); // Expected: false
            System.out.println("num2 < num1: " + (num2 < num1)); // Expected: true

            // Less than or equal to (<=) operator
            System.out.println("num1 <= num2: " + (num1 <= num2)); // Expected: false
            System.out.println("num1 <= num3: " + (num1 <= num3)); // Expected: true

            // Greater than (>) operator
            System.out.println("num1 > num2: " + (num1 > num2)); // Expected: true
            System.out.println("num2 > num1: " + (num2 > num1)); // Expected: false

            // Greater than or equal to (>=) operator
            System.out.println("num1 >= num2: " + (num1 >= num2)); // Expected: true
            System.out.println("num1 >= num3: " + (num1 >= num3)); // Expected: true
        }
    }

