/**
 * 1. Write a function for arithmetic operators(+,-,*,/).
 */
package OPERATORS;

public class Arthematicoperators {


        /**
         * Performs an arithmetic operation based on the given operator.
         *
         * @param num1 The first operand.
         * @param num2 The second operand.
         * @param operator The character representing the operation (+, -, *, /).
         * @return The result of the arithmetic operation, or Double.NaN if the operator is invalid or division by zero occurs.
         */
        public static double performOperation(double num1, double num2, char operator) {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return Double.NaN;
                    }
                    return num1 / num2;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    return Double.NaN;
            }
        }

        public static void main(String[] args) {
            // Example usage
            double result1 = performOperation(10, 5, '+');
            System.out.println("10 + 5 = " + result1);

            double result2 = performOperation(10, 5, '-');
            System.out.println("10 - 5 = " + result2);

            double result3 = performOperation(10, 5, '*');
            System.out.println("10 * 5 = " + result3);

            double result4 = performOperation(10, 2, '/');
            System.out.println("10 / 2 = " + result4);

            double result5 = performOperation(10, 0, '/'); // Division by zero
            System.out.println("10 / 0 = " + result5);

            double result6 = performOperation(10, 5, '%'); // Invalid operator
            System.out.println("10 % 5 = " + result6);
        }
    }

